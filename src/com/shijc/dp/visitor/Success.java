package com.shijc.dp.visitor;

//成功状态
public class Success extends Action{

    @Override
    public void GetManConclusion(Person man) {
        System.out.println("男人成功时");
    }

    @Override
    public void GetWomanConclusion(Person woman) {
        System.out.println("女人成功时");
    }

}