package com.shijc.dp.strategy;

/**
 * 打折收费子类
 */
public class CashRebate extends CashSuper {

    private double moneyRebate = 1;
    public CashRebate(double moneyRebate){
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        // 正常收费，返回原价
        return money*moneyRebate;
    }
}
