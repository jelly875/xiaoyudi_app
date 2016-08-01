package com.xyd.config;


import com.xyd.BuildConfig;

public class AppConfig {
	public static boolean IS_LOGIN_MD5 = false;
	public static boolean IS_PAY_USING_ONE = false;
	public static boolean IS_HTTP_ENCODE = false;
	public static int FORCE_DOMAIN_INDEX = -1;
	public static boolean FORCE_UPDATE = !BuildConfig.DEBUG;
}
