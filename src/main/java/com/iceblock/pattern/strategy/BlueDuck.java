/**
 * 
 */
package com.iceblock.pattern.strategy;

import com.iceblock.pattern.strategy.impl.FlyWithWin;

/**
 * @author YanLiang
 *
 */
public class BlueDuck extends Duck {
	
	/**
	 * 实例化，注入策略模式实现类
	 */
	public BlueDuck() {
		super.setFlyStrategy(new FlyWithWin());
	}

	/* (non-Javadoc)
	 * @see com.iceblock.pattern.strategy.Duck#show()
	 */
	@Override
	public void show() {
		System.out.println("我的脖子是绿色的");

	}

}
