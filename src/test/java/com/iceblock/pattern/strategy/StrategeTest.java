/**
 * 
 */
package com.iceblock.pattern.strategy;

import org.junit.Test;

/**
 * @author YanLiang
 *
 */
public class StrategeTest {
	
	@Test
	public void testStrategy(){
		Duck duck = new RedDuck();
		duck.show();
		duck.quck();
		duck.fly();
		
		duck = new BlueDuck();
		duck.show();
		duck.quck();
		duck.fly();
	}

}
