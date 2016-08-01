package com.xyd.http;

import com.component.logger.Logger;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.xyd.base.BaseApplication;
import com.xyd.config.AppConfig;
import com.xyd.http.request.AbstractRequest;
import com.xyd.http.response.ResponseBean;
import com.xyd.thread.EventBus;
import com.xyd.utils.CommonTools;
import com.xyd.utils.JSONUtils;

import java.io.IOException;
import java.lang.ref.WeakReference;

public class HttpEngine {
    
  //网络请求状态码********************************
    /**
     * 网络错误
     */
    public static final int NET_ERR = -1;
    /**
     * 网络请求成功
     */
    public static final int REQ_SUCCESS = 0;
    /**
     * 服务器繁忙
     */
    public static final int SERVER_IS_BUSY = -3;
    /**
     * 访问超时
     */
    public static final int SERVER_TIME_OUT = -5;
    /**
     * 服务器错误
     */
    public static final int SERVER_ERR = -4;

    private static final String TAG = "HttpEngine";
    private int mTimeOut = 25000;
    private String mUserAgent = "";
    private String mSessionID = "";
    
    public HttpEngine() {}

    public void setUserAgent(String ua) {
        mUserAgent = ua;
    }

    public void setTimeOUT(int to) {
        mTimeOut = to;
    }

    //创建okHttpClient对象
    OkHttpClient mOkHttpClient = new OkHttpClient();

    /**
     * @param action
     * @param req
     * @param responseHandler
     */
    @SuppressWarnings("unchecked")
    public void httpPost(String action, AbstractRequest req, final HttpRspListener responseHandler) {
        httpPost(action, req, responseHandler, AppConfig.IS_HTTP_ENCODE);
    }

    /**
     * @param action
     * @param req
     * @param responseHandler
     */
    @SuppressWarnings("unchecked")
    public void httpPost(String action, AbstractRequest req, final HttpRspListener responseHandler, boolean encode) {
        Class<? extends Object> resClass = new ResponseBean().getClass();
        httpPost(HttpUrlBuilder.getUrlFromAction(action), req, resClass, responseHandler, encode);
    }

    /**
     * @param url
     * @param req
     * @param rspClass
     * @param responseHandler
     * @param encode
     */
    private void httpPost(String url, AbstractRequest req, Class<? extends Object> rspClass, final HttpRspListener responseHandler, boolean encode) {
        try {
            Logger.i(TAG, "GO AHEAD TO POST: " + url);
            String reqString = JSONUtils.toJsonByDefault(req);
            Request request = new Request.Builder()
                    .url(url)
                    .header("Content-Type", "application/json")
                    .post(RequestBody.create(MediaType.parse("utf-8"), reqString))
                    .build();
            mOkHttpClient.newCall(request).enqueue(new PreHandler(responseHandler, rspClass, encode));
        } catch (Exception e) {
            e.printStackTrace();
            Logger.i(TAG, "FAIL TO POST: " + url);
        }
    }


    public interface HttpRspListener {
        void onHttpRsp(int err, String message, ResponseBean rsp);
    }

    /**
     * @author HUANGKAI
     */
    private class PreHandler implements Callback {
        private WeakReference<HttpRspListener> mHandler;
        private Class<? extends Object> mRspClass;
        private boolean mEncode;
        private Object[] mArgs;

        public PreHandler(HttpRspListener listener, Class<? extends Object> rspClass, boolean encode, Object... objects) {
            mHandler = new WeakReference<HttpRspListener>(listener);
            mEncode = encode;
            mRspClass = rspClass;
        }

        @Override
        public void onFailure(Request request, final IOException e) {
            final String responseBody = request.body().toString();
            Logger.e(TAG, "onFailed body: " + responseBody);
            EventBus.runOnUIThread(new Runnable() {
                @Override
                public void run() {
                    final HttpRspListener listener = mHandler.get();
                    if (CommonTools.checkNetworkAvailable(BaseApplication.getInstance())) {
                        listener.onHttpRsp(SERVER_TIME_OUT, e.getMessage(), null);
                    } else {
                        listener.onHttpRsp(NET_ERR, e.getMessage(), null);
                    }

                }
            });
        }

        @Override
        public void onResponse(Response response) throws IOException {
            final String responseBody = response.body().string();
            Logger.i(TAG, "onSuccess body: " + responseBody);
            EventBus.getExecutor().execute(new Runnable() {
                @Override
                public void run() {
                    String resBody = responseBody;
                    final HttpRspListener listener = mHandler.get();
//                    //解密
//                    if (mEncode) {
//                        SessionData data = (SessionData) JSONUtils.fromJsonObjectByDedault(responseBody, SessionData.class);
//                        if (data == null) {
//                            listener.onHttpRsp(SERVER_IS_BUSY, "Parse Response Err", null);
//                            return;
//                        }
//                        mSessionID = data.getSessionID();
//                        Logger.i(TAG, "decode start");
//                        resBody = SecurityMaster.decodeByDefaultKey(data.getContent());
//                        Logger.i(TAG, "decode end");
//
//                    }
                    ResponseBean response = null;
                    try {
                        Logger.i(TAG, "to bean start");
                        response = (ResponseBean) JSONUtils.fromJsonObjectByDedault(resBody, mRspClass);
                        Logger.i(TAG, "to bean end");
                    } catch (Exception e) {
                        e.printStackTrace();
                        EventBus.runOnUIThread(new Runnable() {
                            @Override
                            public void run() {
                                if (listener != null) {
                                    listener.onHttpRsp(SERVER_IS_BUSY, "Parse Response Err", null);
                                }
                            }
                        });
                        return;
                    }
                    final ResponseBean res = response;
                    EventBus.runOnUIThread(new Runnable() {
                        @Override
                        public void run() {
                            Logger.i(TAG, "callback");
                            if (res == null) {
                                listener.onHttpRsp(SERVER_ERR, "Parse Response Null", null);
                                return;
                            }
                            Logger.i(TAG, "callback done");
                            if (listener != null) {
                                listener.onHttpRsp(REQ_SUCCESS, "", res);
                                return;
                            }
                            Logger.i(TAG, "callback failed");

                        }
                    });
                }
            });
        }
    }
}
