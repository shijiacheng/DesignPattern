package com.shijc.dp.iterator;

/**
 * Iterator迭代器抽象类
 */
public abstract class Iterator{
	public abstract Object First();
	public abstract Object Next();
	public abstract boolean IsDone();
	public abstract Object CurrentItem();
}
