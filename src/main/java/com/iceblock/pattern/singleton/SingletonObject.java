/**
 * 
 */
package com.iceblock.pattern.singleton;

/**
 * @author YanLiang
 *
 */
public class SingletonObject {

	/* 初始化null，延迟加载 */
	private static SingletonObject instance = null;

	/* 防止实例化 */
	private SingletonObject() {
	}

	/* 同步方法创建对象 */
	private static synchronized void syncInit() {
		if (instance == null) {
			instance = new SingletonObject();
		}
	}

	/* 获取单例对象，只有在第一次的时候才加载对象 */
	public static SingletonObject getInstance() {
		if (instance == null) {
			syncInit();
		}
		return instance;
	}
}
