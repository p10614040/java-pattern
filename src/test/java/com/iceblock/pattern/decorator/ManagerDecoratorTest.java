/**
 * 
 */
package com.iceblock.pattern.decorator;

import org.junit.Test;

/**
 * @author YanLiang
 * 装饰模式测试
 */
public class ManagerDecoratorTest {

	@Test
	public void testManagerDecorator(){
		System.out.println("------------------ 使用默认 manager 对象 --------------");
		Manager manager = new Manager(new Employee());
		manager.startWork();
		
		System.out.println("------------------ ManagerA 包装 manager 对象 --------------");
		manager = new ManagerA(manager);
		manager.startWork();
		
		System.out.println("------------------ ManagerB 包装 manager 对象 --------------");
		manager = new ManagerB(manager);
		manager.startWork();
		
		System.out.println("------------------ Manager 包装 manager 对象 --------------");
		manager = new Manager(manager);
		manager.startWork();
		
	}
}
