package com.xyd.base;

import android.app.Application;


public class BaseApplication extends Application {
    private static String TAG = "BaseApplication";
    private static BaseApplication mInstance;

    public static BaseApplication getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();
        mInstance = this;

    }
    
    
}
