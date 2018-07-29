package com.shijc.dp.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositePattern {
	public static void main(String[] args) {
		Composite root = new Composite("root");
		root.Add(new Leaf("Leaf A"));
		root.Add(new Leaf("Leaf B"));

		Composite comp = new Composite("Composite X");
		comp.Add(new Leaf("Leaf XA"));
		comp.Add(new Leaf("Leaf XB"));
		root.Add(comp);

		Composite comp2 = new Composite("Composite XY");
		comp2.Add(new Leaf("Leaf XYA"));
		comp2.Add(new Leaf("Leaf XYB"));
		comp.Add(comp2);

		root.Add(new Leaf("Leaf C"));

		Leaf leaf = new Leaf("Leaf D");
		root.Add(leaf);
		root.Remove(leaf);

		root.Display(1);

	}
}

/**
 * Component为组合中的对象声明接口，在适当情况下，实现所有类共有接口的默认行为。
 * 声明一个接口用于访问和管理Component子部件
 */
abstract class Component{
	protected String name;

	public Component(String name) {
		this.name = name;
	}

	public abstract void Add(Component c);
	public abstract void Remove(Component c);
	public abstract void Display(int depth);

}

/*
 * Leaf在组合中表示叶节点对象，叶节点没有子节点
 */
class Leaf extends Component{

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void Add(Component c) {
		System.out.println("Cannot add to a leaf");
	}

	@Override
	public void Remove(Component c) {
		System.out.println("Cannot remove to a leaf");
	}

	/**
	 * 页节点的具体方法，此处是显示其名称和级别
	 * @param depth
	 */
	@Override
	public void Display(int depth) {
		for (int i = 0; i < depth; i++) {
			System.out.print("-");
		}
		System.out.println(name);
	}
}

/**
 * Composite定义枝节点行为，用于存储子部件，在Component接口中实现与子部件有关的操作，
 * 比如增加Add和remove删除
 */
class Composite extends Component{

	private List<Component> children = new ArrayList<>();

	public Composite(String name) {
		super(name);
	}

	@Override
	public void Add(Component c) {
		children.add(c);
	}

	@Override
	public void Remove(Component c) {
		children.remove(c);
	}

	@Override
	public void Display(int depth) {
		for (int i = 0; i < depth; i++) {
			System.out.print("-");
		}
		System.out.println(name);
		for (Component component : children) {
			component.Display(depth+2);
		}
	}

}