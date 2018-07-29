package com.shijc.dp.visitor;

//失败状态
public class Failing extends Action{

    @Override
    public void GetManConclusion(Person man) {
        System.out.println("男人失败时");
    }

    @Override
    public void GetWomanConclusion(Person woman) {
        System.out.println("女人失败时");
    }

}