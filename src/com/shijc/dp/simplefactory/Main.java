package com.shijc.dp.simplefactory;

public class Main {
    public static void main(String[] args){

        Operation oper = OperationFactory.createOperation("*");
        oper.setNumberA(5);
        oper.setNumberB(3);
        double result = oper.getResult();
        System.out.println(result);
    }
}
