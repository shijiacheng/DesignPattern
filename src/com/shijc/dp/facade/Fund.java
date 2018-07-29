package com.shijc.dp.facade;

/**
 * 基金类
 */
public class Fund {
    Stock1 stock1;
    Stock2 stock2;
    NationalDebt1 nationalDebt1;

    public Fund(){
        stock1 = new Stock1();
        stock2 = new Stock2();
        nationalDebt1 = new NationalDebt1();
    }

    public void BuyFund(){
        stock1.Buy();
        stock2.Buy();
        nationalDebt1.Buy();
    }

    public void SellFund(){
        stock1.Sell();
        stock2.Sell();
        nationalDebt1.Sell();
    }
}
