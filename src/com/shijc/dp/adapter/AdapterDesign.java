package com.shijc.dp.adapter;

/**
 * 客户端代码
 */
public class AdapterDesign {

	public static void main(String[] args) {
		Target target = new Adapter();
		target.Request();
	}

}

/**
 * Target,这是客户所期待的接口。目标可以是具体的或者抽象的类，也可以是接口
 */
abstract class Target{
	public void Request(){
		System.out.println("普通请求");
	}
}

/**
 * adptee 需要适配的类
 */
class Adaptee{
	public void SpecificRequest() {
		System.out.println("特殊请求");
	}
}

/**
 * Adapter通过在内部包装一个Adaptee对象，把原接口转换为目标接口
 * @author Cathy Sun
 *
 */
class Adapter extends Target{
	private Adaptee adaptee = new Adaptee();

	@Override
	public void Request() {
		adaptee.SpecificRequest();
	}
}