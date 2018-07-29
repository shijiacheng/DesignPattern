package com.shijc.dp.adapter;
/**
 * 外籍中锋
 */
public class ForeignCenter{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 外籍中锋表示只能听懂汉语拼音jingong
	 */
	public void jingong() {
		System.out.println("外籍中锋"+name+"进攻");

	}
	/**
	 * 外籍中锋表示只能听懂汉语拼音fangshou
	 */
	public void fangshou() {
		System.out.println("外籍中锋"+name+"防守");

	}
}
