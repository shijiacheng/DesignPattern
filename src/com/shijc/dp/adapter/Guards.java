package com.shijc.dp.adapter;
/*
 * 后卫
 */
public class Guards extends Player{

	public Guards(String name) {
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
