/**
 * 
 */
package com.iceblock.pattern.factory;

/**
 * @author YanLiang
 *
 */
public class SenderProduct {

	public Sender productMail() {
		return new MailSender();
	}
	
	public Sender productSms() {
		return new SmsSender();
	}
}
