package com.shijc.dp.visitor;

//结婚状态
public class Marriage extends Action{

    @Override
    public void GetManConclusion(Person man) {
        System.out.println("男人结婚时...");

    }

    @Override
    public void GetWomanConclusion(Person woman) {
        System.out.println("女人结婚时...");
    }

}
