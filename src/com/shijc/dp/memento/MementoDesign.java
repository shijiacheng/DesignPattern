package com.shijc.dp.memento;

public class MementoDesign {
	public static void main(String[] args) {
		Originator o = new Originator();
		// Origiinator初始状态，为“ON”
		o.setState("ON");
		o.show();

		// 保存状态时，由于有了很好的封装，可以隐藏Originator的实现细节
		Caretaker c = new Caretaker();
		c.setMemento(o.CreateMemento());

		// Origiinator改变了状态属性为“OFF”
		o.setState("OFF");
		o.show();

		// 恢复原初始状态
		o.setMemento(c.getMemento());
		o.show();
	}
}

/**
 * 发起人
 */
class Originator{
	// 需要保存的属性，可能有多个
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	// 创建备忘录，将当前需要保存到 信息导入并实例化一个Memento对象
	public Memento CreateMemento(){
		return new Memento(state);
	}

	// 恢复备忘录，将Memento导入并将相关数据恢复
	public void setMemento(Memento memento){
		state = memento.getState();
	}

	// 显示数据
	public void show(){
		System.out.println("State="+state);
	}
}


/**
 * 备忘录类
 */
class Memento {
	private String state;
	public Memento(String state){
		this.state = state;
	}
	public String getState() {
		return state;
	}
}

/**
 * 管理者类
 */
class Caretaker{
	public Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

}

