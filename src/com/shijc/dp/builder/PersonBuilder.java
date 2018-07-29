package com.shijc.dp.builder;

/**
 * 抽象建造人的类
 */
public abstract class PersonBuilder {
    public abstract void BuildHead();
    public abstract void BuildBody();
    public abstract void BuildArmLeft();
    public abstract void BuildArmRight();
    public abstract void BuildLegLeft();
    public abstract void BuildLegRight();
}
