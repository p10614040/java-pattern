/**
 * 
 */
package com.iceblock.pattern.decorator;

/**
 * @author YanLiang
 *
 */
public class ManagerB extends Manager {

	/**
	 * @param project
	 */
	public ManagerB(Project project) {
		super(project);
	}

	@Override
	public void doEarlyWork() {
		System.out.println("项目经理B 开始做设计工作");
	}

	@Override
	public void doEndWork() {
		System.out.println("项目经理B 开始部署上线");
	}

	
}
