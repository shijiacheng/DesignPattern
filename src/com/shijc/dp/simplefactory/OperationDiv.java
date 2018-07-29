package com.shijc.dp.simplefactory;
/**
 * 除法类，继承运算类
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult(){
        double result = 0;
        try {
            if (getNumberB() == 0){
                throw new Exception("除数不能为0");
            }else {
                result = getNumberA() / getNumberB();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
