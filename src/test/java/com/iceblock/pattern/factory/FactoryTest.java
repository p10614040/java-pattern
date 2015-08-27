/**
 * 
 */
package com.iceblock.pattern.factory;

import org.junit.Test;

/**
 * @author YanLiang
 *
 */
public class FactoryTest {

	/**
	 * @author yan.liang
	 * @date 2015年8月27日 下午3:48:53
	 * @Description 工厂模式
	 */
	@Test
	public void testFactory() {
		SenderProduct senderProduct = new SenderProduct();
		Sender mailSender = senderProduct.productMail();
		mailSender.send("hello !");
		
		Sender smsSender = senderProduct.productSms();
		smsSender.send(" hello !");
	}
	
	/**
	 * @author yan.liang
	 * @date 2015年8月27日 下午3:49:06
	 * @Description 静态工厂模式
	 */
	@Test
	public void testStaticFactory() {
		Sender mailSender = StaticSenderProduct.productMail();
		mailSender.send("static hello !");
		
		Sender smsSender = StaticSenderProduct.productSms();
		smsSender.send("static  hello !");
	}
}
