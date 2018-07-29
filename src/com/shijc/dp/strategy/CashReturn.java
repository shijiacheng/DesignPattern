package com.shijc.dp.strategy;

/**
 * 满减收费子类
 */
public class CashReturn extends CashSuper {

    private double moneyCondition = 0;// 满足的条件
    private double moneyReturn = 0;//返利
    public CashReturn(double moneyCondition,double moneyReturn){
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money>=moneyCondition){
            result = money - Math.floor(money/moneyCondition)*moneyReturn;
        }
        return result;
    }
}
