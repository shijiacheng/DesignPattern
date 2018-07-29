package com.shijc.dp.memento;
/**
 * 角色状态管理者
 */
public class RoleStateCaretaker {
	private RoleStateMemento memento;

	public RoleStateMemento getMemento() {
		return memento;
	}

	public void setMemento(RoleStateMemento memento) {
		this.memento = memento;
	}

}
