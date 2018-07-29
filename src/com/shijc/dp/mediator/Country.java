package com.shijc.dp.mediator;

/**
 * 国家类，相当于Colleague类
 */
public abstract class Country {
    protected UnitedNations mediator;
    public Country(UnitedNations mediator){
        this.mediator = mediator;
    }
}
