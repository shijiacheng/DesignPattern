package com.shijc.dp.builder;

/**
 * 建造胖的小人
 */
public class PersonFatBuilder extends PersonBuilder{
    @Override
    public void BuildHead() {
        System.out.println("画一个胖胖的头");
    }

    @Override
    public void BuildBody() {
        System.out.println("画一个胖胖的身体");
    }

    @Override
    public void BuildArmLeft() {
        System.out.println("画一个胖胖的左胳膊");
    }

    @Override
    public void BuildArmRight() {
        System.out.println("画一个胖胖的右胳膊");
    }

    @Override
    public void BuildLegLeft() {
        System.out.println("画一个胖胖的左腿");
    }

    @Override
    public void BuildLegRight() {
        System.out.println("画一个胖胖的右腿");
    }
}
