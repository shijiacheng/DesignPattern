package com.shijc.dp.strategy;

/**
 * 现金收费抽象类
 */
public abstract class CashSuper {
    /**
     * 现金收取超类方法，传入原价，返回当前价
     */
    public abstract double acceptCash(double money);
}
