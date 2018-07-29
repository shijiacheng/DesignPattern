package com.shijc.dp.decorator;

/**
 * 具体服饰类-垮裤 ConcrteFecorator
 */
public class BigTrouser extends Finery {

    @Override
    public void operation() {
        System.out.print("垮裤");
        super.operation();
    }
}
