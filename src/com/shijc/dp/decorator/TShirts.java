package com.shijc.dp.decorator;

/**
 * 具体服饰类-T恤 ConcrteFecorator
 */
public class TShirts extends Finery {

    @Override
    public void operation() {
        System.out.print("TShirts");
        super.operation();
    }
}
