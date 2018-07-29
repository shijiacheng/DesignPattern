package com.shijc.dp.chainofresponsibility;

public class ChainOfResponsibilityPattern {
	
	public static void main(String[] args) {
		Handler h1 = new ConcreteHandler1();
		Handler h2 = new ConcreteHandler2();
		Handler h3 = new ConcreteHandler3();
		
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);
		
		int[] requests = {2,5,14,22,18,3,27,20};
		for (int i = 0; i < requests.length; i++) {
			h1.HandlerRequest(requests[i]);
		}
	}

}

/**
 * Handler类，定义一个处理请示的接口
 */
abstract class Handler{
	protected Handler successor;
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	// 处理请求的抽象方法
	public abstract void HandlerRequest(int request);
}

/**
 * ConcreteHandler类，具体处理者类，处理它所负责的请求，可访问它的后继者，如果可处理该请求，就处理之，否则就将该请求转发给它的后继者
 * 
 * ConcreteHandler1，请求数在0和10之间则有权处理，否则转到下一位
 */
class ConcreteHandler1 extends Handler{

	@Override
	public void HandlerRequest(int request) {
		if (request >= 0 && request < 10) {
			System.out.println("ConcreteHandler1处理请求"+request);
		}else if(successor !=null){
			successor.HandlerRequest(request);
		}
		
	}
	
}

/**
 *  ConcreteHandler2，请求数在10和20之间则有权处理，否则转到下一位
 */
class ConcreteHandler2 extends Handler{

	@Override
	public void HandlerRequest(int request) {
		if (request >= 10 && request < 20) {
			System.out.println("ConcreteHandler2处理请求"+request);
		}else if(successor !=null){
			successor.HandlerRequest(request);
		}
		
	}
	
}

/**
 *  ConcreteHandler3，请求数在20和30之间则有权处理，否则转到下一位
 */
class ConcreteHandler3 extends Handler{

	@Override
	public void HandlerRequest(int request) {
		if (request >= 20 && request < 30) {
			System.out.println("ConcreteHandler3处理请求"+request);
		}else if(successor !=null){
			successor.HandlerRequest(request);
		}
		
	}
	
}