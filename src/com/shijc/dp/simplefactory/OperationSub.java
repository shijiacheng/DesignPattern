package com.shijc.dp.simplefactory;
/**
 * 减法类，继承运算类
 */
public class OperationSub extends Operation {

    @Override
    public double getResult() {
        double result = getNumberA() - getNumberB();
        return result;
    }
}
