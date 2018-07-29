package com.shijc.dp.singleton;

public class Singleton {
	private static Singleton instance;
	// 构造方法private，这就堵死了外界利用new创建此类实例的可能
	private Singleton(){}

	// 获取本类实例的唯一全局访问点
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
