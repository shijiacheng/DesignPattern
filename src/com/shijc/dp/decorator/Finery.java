package com.shijc.dp.decorator;

/**
 * 服饰类 Decorator
 */

public class Finery extends People {

    protected People component;

    //打扮
    public void Decorate(People component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component!=null){
            component.operation();
        }
    }
}
