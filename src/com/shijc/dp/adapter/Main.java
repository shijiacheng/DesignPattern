package com.shijc.dp.adapter;

public class Main {
	public static void main(String[] args) {
		Player maidi = new Forwards("麦迪");
		maidi.Attack();
		maidi.Defense();

		Player badier = new Forwards("巴蒂尔");
		badier.Defense();

		// 翻译告诉姚明，教练要你进攻和防守
		Player yaoming = new Translator("姚明");
		yaoming.Attack();
		yaoming.Defense();
	}

}
