/**
 * 
 */
package com.iceblock.pattern.decorator;

/**
 * @author YanLiang
 *
 */
public class Manager implements Project {
	
	private Project project;
	
	/**
	 * 
	 */
	public Manager(Project project) {
		this.project = project;
	}

	/* (non-Javadoc)
	 * @see com.iceblock.pattern.decorator.Project#doCoding()
	 */
	@Override
	public void doCoding() {
		this.startWork();

	}
	
	public void startWork() {
		this.doEarlyWork();
		this.project.doCoding();
	}
	
	/**
	 * @author yan.liang
	 * @date 2015年8月28日 上午10:55:03
	 * @Description 做早期工作
	 */
	public void doEarlyWork() {
		
	}
	
	/**
	 * @author yan.liang
	 * @date 2015年8月28日 上午10:57:33
	 * @Description 做收尾工作
	 */
	public void doEndWork() {
		
	}

}
