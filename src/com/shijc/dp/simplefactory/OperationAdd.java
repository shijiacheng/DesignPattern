package com.shijc.dp.simplefactory;

/**
 * 加法类，继承运算类
 */
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        double result = getNumberA() + getNumberB();
        return result;
    }
}
