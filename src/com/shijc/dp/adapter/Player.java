package com.shijc.dp.adapter;

/**
 * 球员
 */
public abstract class Player {

	protected String name;
	public Player(String name){
		this.name = name;
	}

	// 进攻
	public abstract void Attack();
	// 防守
	public abstract void Defense();
}
