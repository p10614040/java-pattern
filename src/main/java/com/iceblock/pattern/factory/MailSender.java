/**
 * 
 */
package com.iceblock.pattern.factory;

/**
 * @author YanLiang
 *
 */
public class MailSender implements Sender {

	/* (non-Javadoc)
	 * @see com.iceblock.pattern.factory.Sender#send(java.lang.String)
	 */
	@Override
	public void send(String message) {
		
		System.out.println("this is Mail send : " + message);

	}

}
