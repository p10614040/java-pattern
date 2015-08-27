/**
 * 
 */
package com.iceblock.pattern.strategy;

import com.iceblock.pattern.strategy.impl.FlyWithWin;

/**
 * @author YanLiang
 *
 */
public class RedDuck extends Duck{
	
	/**
	 * 
	 */
	public RedDuck() {
		super.setFlyStrategy(new FlyWithWin());
	}

	/* (non-Javadoc)
	 * @see com.iceblock.pattern.strategy.Duck#show()
	 */
	@Override
	public void show() {
		System.out.println("我的头是红色的");
	}

	
}
