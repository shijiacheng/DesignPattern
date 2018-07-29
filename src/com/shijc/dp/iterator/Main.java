package com.shijc.dp.iterator;

public class Main {
	public static void main(String[] args) {
		//公交车，即聚集对象
		ConcreteAggregate a = new ConcreteAggregate();

		// 新上来的乘客，即对象数组
		a.setItems("大鸟");
		a.setItems("小菜");
		a.setItems("行李");
		a.setItems("老外");
		a.setItems("公司内部员工");
		a.setItems("小偷");

		//售票员出场，先看好上车都是哪些人
		Iterator i = new ConcreteIterator(a);
		Object item = i.First();
		while(!i.IsDone()){
			System.out.println(i.CurrentItem()+"请买车票！");
			//下一个乘客
			i.Next();
		}
	}
}
