package com.shijc.dp.memento;
/**
 * 游戏角色类
 */
public class GameRole {
	private int vitality;//生命力
	private int attack;//攻击力
	private int defense;// 防御力
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

	/**
	 * 状态显示
	 */
	public void setDisplay(){
		System.out.println("角色当前状态：");
		System.out.println("体力:"+ vitality);
		System.out.println("攻击力:"+ attack);
		System.out.println("防御力:"+ defense);
	}

	/**
	 * 获得初始状态
	 */
	public void GetInitState(){
		vitality = 100;
		attack = 100;
		defense = 100;
	}

	/**
	 * 战斗，与大boss决战，损耗
	 */
	public void fight(){
		vitality = 0;
		attack = 0;
		defense = 0;
	}

	// 保存角色状态，将三个值通过实例化：角色状态存储箱返回
	public RoleStateMemento saveState(){
		return new RoleStateMemento(vitality, attack, defense);
	}

	public void recoveryState(RoleStateMemento memento){
		vitality = memento.getVitality();
		attack = memento.getAttack();
		defense = memento.getDefense();
	}
}
