package com.shijc.dp.builder;

/**
 * 建造瘦的小人
 */
public class PersonThinBuilder extends PersonBuilder{
    @Override
    public void BuildHead() {
        System.out.println("画一个瘦瘦的头");
    }

    @Override
    public void BuildBody() {
        System.out.println("画一个瘦瘦的身体");
    }

    @Override
    public void BuildArmLeft() {
        System.out.println("画一个瘦瘦的左胳膊");
    }

    @Override
    public void BuildArmRight() {
        System.out.println("画一个瘦瘦的右胳膊");
    }

    @Override
    public void BuildLegLeft() {
        System.out.println("画一个瘦瘦的左腿");
    }

    @Override
    public void BuildLegRight() {
        System.out.println("画一个瘦瘦的右腿");
    }
}
