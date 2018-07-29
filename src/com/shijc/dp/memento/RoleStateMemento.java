package com.shijc.dp.memento;
/**
 * 角色状态存储箱类
 */
public class RoleStateMemento {
	private int vitality;//生命力
	private int attack;//攻击力
	private int defense;// 防御力

	// 将生命力、攻击力、防御力存入状态存储箱对象中
	public RoleStateMemento(int vitality, int attack, int defense) {
		this.vitality = vitality;
		this.attack = attack;
		this.defense = defense;
	}
	public int getVitality() {
		return vitality;
	}
	public void setVitality(int vitality) {
		this.vitality = vitality;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}

}
