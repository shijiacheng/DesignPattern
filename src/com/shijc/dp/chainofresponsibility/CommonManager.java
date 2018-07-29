package com.shijc.dp.chainofresponsibility;
/**
 * 总经理类
 *
 */
public class CommonManager extends Manager{

	public CommonManager(String name) {
		super(name);
	}

	@Override
	public void RequestApplicatios(Request request) {
		// 经理的权限就是可准许下两天以内的假期
		if(request.getRequestType().equals("请假") && request.getNumber()<=2){
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
