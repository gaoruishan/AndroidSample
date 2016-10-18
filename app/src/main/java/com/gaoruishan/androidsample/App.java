package com.gaoruishan.androidsample;

import android.support.multidex.MultiDexApplication;

/**
 * @作者:gaoruishan
 * @时间:2016/10/14/10:38
 * @邮箱:grs0515@163.com
 */
public class App extends MultiDexApplication {


	private static App ourInstance = new App();

	public static App getInstance() {
		return ourInstance;
	}

	public App() {
	}

	@Override
	public void onCreate() {
		super.onCreate();
	}
}
