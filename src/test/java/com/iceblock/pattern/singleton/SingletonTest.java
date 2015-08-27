/**
 * 
 */
package com.iceblock.pattern.singleton;

import org.junit.Test;

/**
 * @author YanLiang
 *
 */
public class SingletonTest {

	/**
	 * @author yan.liang
	 * @date 2015年8月27日 下午4:00:16
	 * @Description 测试单例模式
	 */
	@Test
	public void testSingleton() {
		SingletonObject singletonObject = SingletonObject.getInstance();
		SingletonObject singletonObject2 = SingletonObject.getInstance();
		System.out.println(singletonObject.hashCode());
		System.out.println(singletonObject2.hashCode());
	}
}
