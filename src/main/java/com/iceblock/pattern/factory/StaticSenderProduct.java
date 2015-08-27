/**
 * 
 */
package com.iceblock.pattern.factory;

/**
 * @author YanLiang
 *
 */
public class StaticSenderProduct {

	public static Sender productMail() {
		return new MailSender();
	}
	
	public static Sender productSms() {
		return new SmsSender();
	}
}
