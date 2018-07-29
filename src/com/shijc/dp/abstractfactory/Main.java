package com.shijc.dp.abstractfactory;

import com.shijc.dp.simplefactory.Operation;

public class Main {
    public static void main(String[] args) throws InstantiationException,
            IllegalAccessException {
        Operation operation = OperationFactory.createOperation("/");

        operation.setNumberA(7);
        operation.setNumberB(8);

        System.out.println(operation.getNumberA());
    }
}
