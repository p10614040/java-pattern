/**
 * 
 */
package com.iceblock.pattern.strategy;

/**
 * @author YanLiang 超类，所有鸭子继承此类
 */
public abstract class Duck {

	/* 类似Spring的bean实现 */
	private FlyStrategy flyStrategy;

	/* 注入飞行能力 */
	public void setFlyStrategy(FlyStrategy flyStrategy) {
		this.flyStrategy = flyStrategy;
	}

	public void quck() {
		System.out.println("嘎嘎嘎嘎...");
	}

	/* 抽象方法只能出现在抽象类中 */
	public abstract void show();

	/* 策略模式实现飞行能力，类中只调用接口 */
	public void fly() {
		this.flyStrategy.perfomaceFly();
	}
}
