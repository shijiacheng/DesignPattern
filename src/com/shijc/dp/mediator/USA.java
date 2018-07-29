package com.shijc.dp.mediator;

/**
 * 美国类，相当于ConcreteColleague1
 */
public class USA extends Country{

    public USA(UnitedNations mediator) {
        super(mediator);
    }
    //声明
    public void Declare(String message){
        mediator.Declare(message,this);
    }
    // 获得消息
    public void getMessage(String message){
        System.out.println("美国获得对方信息："+message);
    }

}
