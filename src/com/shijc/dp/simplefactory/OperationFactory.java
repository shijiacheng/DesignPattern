package com.shijc.dp.simplefactory;

/**
 * 简单运算工厂类
 */
public class OperationFactory {
    public static Operation createOperation(String operate){
        Operation oper = null;
        switch (operate){
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;

            default:
                break;
        }
        return oper;
    }
}
