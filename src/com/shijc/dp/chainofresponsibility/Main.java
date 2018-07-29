package com.shijc.dp.chainofresponsibility;

public class Main {
	
	public static void main(String[] args) {
		CommonManager jingli = new CommonManager("经理");
		Majordomo zongjian = new Majordomo("总监");
		GeneralManager zongjingli = new GeneralManager("总经理");
		jingli.setSuperior(zongjian);
		zongjian.setSuperior(zongjingli);
		
		Request request = new Request();
		request.setRequestType("请假");
		request.setRequestContent("小菜请假");
		request.setNumber(1);
		jingli.RequestApplicatios(request);
		
		Request request2 = new Request();
		request2.setRequestType("请假");
		request2.setRequestContent("小菜请假");
		request2.setNumber(4);
		jingli.RequestApplicatios(request2);
		
		Request request3 = new Request();
		request3.setRequestType("加薪");
		request3.setRequestContent("小菜请求加薪");
		request3.setNumber(500);
		jingli.RequestApplicatios(request3);
		
		Request request4 = new Request();
		request4.setRequestType("加薪");
		request4.setRequestContent("小菜请求加薪");
		request4.setNumber(1000);
		jingli.RequestApplicatios(request4);
	}

}
