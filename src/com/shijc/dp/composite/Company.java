package com.shijc.dp.composite;
/**
 * 公司类，抽象类或接口
 */
public abstract class Company {
	protected String name;

	public Company(String name) {
		this.name = name;
	}

	public abstract void Add(Company c);//增加
	public abstract void Remove(Company c);//移除
	public abstract void Display(int depth);//显示
	public abstract void LineOfDuty();//履行职责
}
