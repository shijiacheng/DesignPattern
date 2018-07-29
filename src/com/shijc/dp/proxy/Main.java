package com.shijc.dp.proxy;

/**
 * 客户端代码
 */
public class Main {
    public static void main(String[] args){
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("李娇娇");
        Proxy proxy = new Proxy(jiaojiao);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
