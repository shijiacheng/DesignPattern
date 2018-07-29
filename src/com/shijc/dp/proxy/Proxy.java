package com.shijc.dp.proxy;

/**
 * 代理类
 */
public class Proxy implements GiveGift{
    private Pursuit gg;
    public Proxy(SchoolGirl mm){
        gg = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}
