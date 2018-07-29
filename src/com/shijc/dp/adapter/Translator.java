package com.shijc.dp.adapter;

//翻译
public class Translator extends Player{
	
	private ForeignCenter foreignCenter = new ForeignCenter();

	public Translator(String name) {
		super(name);
		foreignCenter.setName(name);
	}

	@Override
	public void Attack() {
		foreignCenter.jingong();
		
	}

	@Override
	public void Defense() {
		foreignCenter.fangshou();
	}

}
