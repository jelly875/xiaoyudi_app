package com.xyd;

import com.xyd.http.HttpEngine;

public class AppEngine {
    private static AppEngine mInstance;

    public static AppEngine getInstance() {
        if (mInstance == null) {
            mInstance = new AppEngine();
        }
        return mInstance;
    }

    private HttpEngine mEngine;

    private LoginManager mLoginManager;

    private AppEngine() {

    }

    public void startup() {
    }

    public void release() {

        if (mEngine != null) {
            mEngine = null;
        }
    }

    public HttpEngine getHttpEngine() {
        if (mEngine == null) {
            mEngine = new HttpEngine();
        }
        return mEngine;
    }

    public LoginManager getLoginManager() {
        if (mLoginManager == null) {
            mLoginManager = new LoginManager();
        }
        return mLoginManager;
    }
}
