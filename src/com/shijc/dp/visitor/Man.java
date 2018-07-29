package com.shijc.dp.visitor;

//男
public class Man extends Person{

    @Override
    public void Accept(Action action) {
        action.GetManConclusion(this);
    }

}