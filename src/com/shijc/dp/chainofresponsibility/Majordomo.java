package com.shijc.dp.chainofresponsibility;
/**
 * 总监类
 *
 */
public class Majordomo extends Manager{

	public Majordomo(String name) {
		super(name);
	}

	@Override
	public void RequestApplicatios(Request request) {
		// 经理的权限就是可准许下属一周以内的假期
		if(request.getRequestType().equals("请假") && request.getNumber()<=5){
			System.out.println(name+":"+request.getRequestContent()+" 数量"+request.getNumber()+"被批准");
		}
		// 其余的申请都需转到上级
		else{
			if(superior!=null){
				superior.RequestApplicatios(request);
			}
		}
	}

}
