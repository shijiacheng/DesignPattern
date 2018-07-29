package com.shijc.dp.adapter;
/**
 * 中锋
 * @author Cathy Sun
 *
 */
public class Center extends Player{

	public Center(String name) {
		super(name);
	}

	@Override
	public void Attack() {
		System.out.println(name+"进攻");

	}

	@Override
	public void Defense() {
		System.out.println(name+"防守");

	}
}
