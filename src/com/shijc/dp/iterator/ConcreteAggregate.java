package com.shijc.dp.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteAggregate 具体聚集类，继承Aggregate
 */
public class ConcreteAggregate extends Aggregate{

	private List<Object> items = new ArrayList<>();

	@Override
	public Iterator CreateIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(this);
	}

	public int count() {
		return items.size();
	}

	public Object getItems(int index) {
		return items.get(index);
	}

	public void setItems(Object item) {
		items.add(item);
	}

}
