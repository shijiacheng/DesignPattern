package com.shijc.dp.decorator;

public class Main {
    public static void main(String[] args){
        People xiaocheng = new People("小成");
        System.out.println("第一种装扮：");
        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();

        tShirts.Decorate(xiaocheng);
        bigTrouser.Decorate(tShirts);
        bigTrouser.operation();

    }
}
