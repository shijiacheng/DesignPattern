package com.shijc.dp.chainofresponsibility;

/**
 * 管理者
 */
public abstract class Manager {

	protected String name;
	//管理者的上级
	protected Manager superior;
	public Manager(String name){
		this.name = name;
	}
	
	public void setSuperior(Manager superior) {
		this.superior = superior;
	}
	
	public abstract void RequestApplicatios(Request request);
}
