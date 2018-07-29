package com.shijc.dp.strategy;

/**
 * 正常收费子类
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        // 正常收费，返回原价
        return money;
    }
}
