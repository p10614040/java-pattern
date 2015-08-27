/**
 * 
 */
package com.iceblock.pattern.strategy.impl;

import com.iceblock.pattern.strategy.FlyStrategy;

/**
 * @author YanLiang
 *
 */
public class FlyWithWin implements FlyStrategy {

	/* (non-Javadoc)
	 * @see com.iceblock.pattern.strategy.FlyStrategy#perfomaceFly()
	 */
	@Override
	public void perfomaceFly() {
		System.out.println("我是这样飞的");
	}

}
