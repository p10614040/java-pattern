/**
 * 
 */
package com.iceblock.pattern.decorator;

/**
 * @author YanLiang
 *
 */
public class ManagerA extends Manager {

	/**
	 * @param project
	 */
	public ManagerA(Project project) {
		super(project);
	}

	@Override
	public void doEarlyWork() {
		System.out.println("项目经理A 开始做项目分析工作");
	}
	
	

}
