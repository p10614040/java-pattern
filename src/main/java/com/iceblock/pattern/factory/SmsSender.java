/**
 * 
 */
package com.iceblock.pattern.factory;

/**
 * @author YanLiang
 *
 */
public class SmsSender implements Sender {

	/* (non-Javadoc)
	 * @see com.iceblock.pattern.factory.Sender#send(java.lang.String)
	 */
	@Override
	public void send(String message) {
		
		System.out.println("this is sms send : " + message);

	}

}
