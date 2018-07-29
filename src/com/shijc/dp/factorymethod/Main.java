package com.shijc.dp.factorymethod;

import com.shijc.dp.simplefactory.Operation;

/**
 * 客户端调用
 */
public class Main {
    public static void main(String[] args){
        IFactory operFactory = new AddFactory();
        Operation oper = operFactory.createOpeation();
        oper.setNumberA(2);
        oper.setNumberB(3);
        double result = oper.getResult();
        System.out.println(result);
    }
}
