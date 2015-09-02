/**
 * 
 */
package com.iceblock.pattern.decorator;

/**
 * @author YanLiang
 *
 */
public class Employee implements Project {

	/* (non-Javadoc)
	 * @see com.iceblock.pattern.decorator.Project#doCoding()
	 */
	@Override
	public void doCoding() {
		 System.out.println("代码工人 在编写代码，加班编啊编啊，终于编完了！"); 
	}

}
