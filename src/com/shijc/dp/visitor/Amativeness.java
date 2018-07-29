package com.shijc.dp.visitor;

//恋爱状态
public class Amativeness extends Action {

    @Override
    public void GetManConclusion(Person man) {
        System.out.println("男人恋爱时");
    }

    @Override
    public void GetWomanConclusion(Person woman) {
        System.out.println("女人恋爱时");
    }

}