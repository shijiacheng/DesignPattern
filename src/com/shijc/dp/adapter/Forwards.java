package com.shijc.dp.adapter;
/**
 * 前锋
 */
public class Forwards extends Player{

	public Forwards(String name) {
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
