package com.shijc.dp.chainofresponsibility;
/**
 * 总经理类，可以处理全部任何事情
 */
public class GeneralManager extends Manager{

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void RequestApplicatios(Request request) {
		if(request.getRequestType().equals("请假")){
			System.out.println(name+":"+request.getRequestContent()+" 数量"+request.getNumber()+"被批准");
		}
		else if(request.getRequestType().equals("加薪") && request.getNumber() <= 500){
			System.out.println(name+":"+request.getRequestContent()+" 数量"+request.getNumber()+"被批准");
		}
		else if(request.getRequestType().equals("加薪") && request.getNumber() > 500){
			System.out.println(name+":"+request.getRequestContent()+" 数量"+request.getNumber()+"再说吧");
		}
	}

}
