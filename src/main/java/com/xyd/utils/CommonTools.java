package com.xyd.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.component.logger.Logger;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CommonTools {


//	/**
//	 * 短暂显示Toast消息
//	 * 
//	 * @param context
//	 * @param message
//	 */
//	public static void showShortToast(Context context, String message) {
//		LayoutInflater inflater = (LayoutInflater) context
//				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//		View view = inflater.inflate(R.layout.custom_toast, null);
//		TextView text = (TextView) view.findViewById(R.id.toast_message);
//		text.setText(message);
//		Toast toast = new Toast(context);
//		toast.setDuration(Toast.LENGTH_SHORT);
//		toast.setGravity(Gravity.BOTTOM, 0, 300);
//		toast.setView(view);
//		toast.show();
//	}

    /**
     * 根据手机分辨率从dp转成px
     *
     * @param context
     * @param dpValue
     * @return
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     */
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f) - 15;
    }

    /**
     * 获取手机状态栏高度
     *
     * @param context
     * @return
     */
    public static int getStatusBarHeight(Context context) {
        Class<?> c = null;
        Object obj = null;
        java.lang.reflect.Field field = null;
        int x = 0;
        int statusBarHeight = 0;
        try {
            c = Class.forName("com.android.internal.R$dimen");
            obj = c.newInstance();
            field = c.getField("status_bar_height");
            x = Integer.parseInt(field.get(obj).toString());
            statusBarHeight = context.getResources().getDimensionPixelSize(x);
            return statusBarHeight;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return statusBarHeight;
    }


    /**
     * 判断手机号码
     */
    public static boolean isMobileNO(String mobiles) {

        Pattern pattern = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
        Matcher matcher = pattern.matcher(mobiles);

        return matcher.matches();

    }

    /**
     * 判断是否有sd卡
     *
     * @return
     */
    public static boolean haveSDCard() {
        return android.os.Environment.getExternalStorageState().equals(
                android.os.Environment.MEDIA_MOUNTED);
    }

//    /**
//     * 获取版本号
//     *
//     * @return 当前应用的版本号
//     */
//    public static String getVersion(Context c) {
//        try {
//            PackageManager manager = c.getPackageManager();
//            PackageInfo info = manager.getPackageInfo(c.getPackageName(), 0);
//            String version = info.versionName;
//            return c.getString(R.string.version_name) + version;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return c.getString(R.string.unkown_version);
//        }
//    }
//
//    /**
//     * 判断手机是否安装了微信
//     * @param context
//     * @return
//     */
//    public static boolean isWXAppInstalledAndSupported(Context context) {
//        IWXAPI msgApi = WXAPIFactory.createWXAPI(context, null);
//        msgApi.registerApp(Constants.WX_PAY_APP_ID);
//
//        boolean sIsWXAppInstalledAndSupported = msgApi.isWXAppInstalled()
//                && msgApi.isWXAppSupportAPI();
//        if(!sIsWXAppInstalledAndSupported){
//            ToastUtils.ToastTextShort(context,R.string.not_install_wx);
//        }
//
//        return sIsWXAppInstalledAndSupported;
//    }

    // 检测网络
    public static boolean checkNetworkAvailable(Context context) {
        ConnectivityManager connectivity = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity == null) {
            return false;
        } else {
            @SuppressWarnings("deprecation")
			NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null) {
                for (int i = 0; i < info.length; i++) {
                    if (info[i].getState() == NetworkInfo.State.CONNECTED) {
                        NetworkInfo netWorkInfo = info[i];
                        if (netWorkInfo.getType() == ConnectivityManager.TYPE_WIFI) {
                            if(ping()){
                                return true;
                            }
                        } else if (netWorkInfo.getType() == ConnectivityManager.TYPE_MOBILE) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;

    }

    private static boolean ping() {

        String result = null;
        try {
            String ip = "www.baidu.com";// ping 的地址，可以换成任何一种可靠的外网
            Process p = Runtime.getRuntime().exec("ping -c 3 -w 100 " + ip);// ping网址3次
//            // 读取ping的内容，可以不加
//            InputStream input = p.getInputStream();
//            BufferedReader in = new BufferedReader(new InputStreamReader(input));
//            StringBuffer stringBuffer = new StringBuffer();
//            String content = "";
//            while ((content = in.readLine()) != null) {
//                stringBuffer.append(content);
//            }
//           // Log.d("------ping-----", "result content : " + stringBuffer.toString());
            // ping的状态
            int status = p.waitFor();
            if (status == 0) {
                result = "success";
                Logger.d("network","network"+result);
                return true;
            } else {
                result = "failed";
            }
        } catch (IOException e) {
            result = "IOException";
        } catch (InterruptedException e) {
            result = "InterruptedException";
        } finally {
           // Log.d("----result---", "result = " + result);
        }
        Logger.e("network","network"+result);
        return false;

    }

    }
