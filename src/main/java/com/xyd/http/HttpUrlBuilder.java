package com.xyd.http;

import com.xyd.BuildConfig;
import com.xyd.config.AppConfig;

public class HttpUrlBuilder {
    private static final String TEST_INTERNAL_DOMAIN = "http://192.168.1.200:8080/cxl-app-proxy-1.0/";
    private static final String TEST_DOMAIN = "http://127.0.0.1:8080/";
    private static final String FORMAL_DOMAIN = "http://www.dajiang.info:18080/cxl-app-proxy-1.0/";

    public static final String[] DOMAINS = {FORMAL_DOMAIN, TEST_DOMAIN, TEST_INTERNAL_DOMAIN};

    //所有请求action************************************************************************开始/

    private static final String ACTION_POST_LOGIN = "login.do";

    //所有请求action************************************************************************结束/


	private static final String getDOMAIN() {
		return AppConfig.FORCE_DOMAIN_INDEX  != -1 ? DOMAINS[AppConfig.FORCE_DOMAIN_INDEX ] : (BuildConfig.DEBUG ? TEST_DOMAIN : FORMAL_DOMAIN);
	}
	public static String getUrlFromAction(String action) {
		//return TEST_INTERNAL_DOMAIN + action;
		return  getDOMAIN()  + action;
	}

}	
