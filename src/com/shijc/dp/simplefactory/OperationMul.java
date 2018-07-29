package com.shijc.dp.simplefactory;
/**
 * 乘法类，继承运算类
 */
public class OperationMul extends Operation {

    @Override
    public double getResult() {
        double result = getNumberA() * getNumberB();
        return result;
    }
}
