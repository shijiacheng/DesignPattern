package com.shijc.dp.iterator;

/*
 * ConcreteIterator 具体迭代器类，继承Iterator
 */
public class ConcreteIterator extends Iterator{

	private ConcreteAggregate aggregate;
	private int current = 0;

	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
	}

	@Override
	public Object First() {
		return aggregate.getItems(0);
	}

	@Override
	public Object Next() {
		Object ret = null;
		current++;
		if (current < aggregate.count()) {
			ret = aggregate.getItems(current);
		}
		return ret;
	}

	@Override
	public boolean IsDone() {
		return current >= aggregate.count()? true : false;
	}

	@Override
	public Object CurrentItem() {
		// TODO Auto-generated method stub
		return aggregate.getItems(current);
	}

}
