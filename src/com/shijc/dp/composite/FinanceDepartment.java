package com.shijc.dp.composite;

/**
 * 财务部
 */
public class FinanceDepartment extends Company{

	public FinanceDepartment(String name) {
		super(name);
	}

	@Override
	public void Add(Company c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Remove(Company c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Display(int depth) {
		for (int i = 0; i < depth; i++) {
			System.out.print("-");
		}
		System.out.println(name);

	}

	@Override
	public void LineOfDuty() {
		System.out.println(name+"公司财务收支管理");

	}

}
