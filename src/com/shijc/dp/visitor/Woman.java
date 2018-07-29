package com.shijc.dp.visitor;

//女
public class Woman extends Person{

    @Override
    public void Accept(Action action) {
        action.GetWomanConclusion(this);
    }

}