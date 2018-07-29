package com.shijc.dp.visitor;

public class Main {
    public static void main(String[] args) {
        PersonObjectStructure objectStructure=new PersonObjectStructure();
        objectStructure.Attach(new Man());
        objectStructure.Attach(new Woman());

        //看男人和女人在成功时的状态
        Success success=new Success();
        objectStructure.Display(success);

        //新增一个结婚状态
        Marriage marriage=new Marriage();
        objectStructure.Display(marriage);
    }
}
