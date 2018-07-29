package com.shijc.dp.memento;

public class Main {
	public static void main(String[] args) {
		// 游戏角色初始状态，三项指标都是100
		GameRole role = new GameRole();
		role.GetInitState();
		role.setDisplay();

		// 保存进度
		RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
		stateAdmin.setMemento(role.saveState());

		// 大战boss的时候损失严重
		role.fight();
		role.setDisplay();

		//恢复之前的状态
		role.recoveryState(stateAdmin.getMemento());
		role.setDisplay();
	}
}
