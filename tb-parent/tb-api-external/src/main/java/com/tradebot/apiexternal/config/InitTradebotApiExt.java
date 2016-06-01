package com.tradebot.apiexternal.config;

public class InitTradebotApiExt {
	
	static{
		System.setProperty("http.proxySet", "true");
		System.setProperty("http.proxyHost", "10.0.50.3");
		System.setProperty("http.proxyPort", "8080");
	}

}
