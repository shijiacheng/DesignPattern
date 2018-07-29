package com.shijc.dp.bridge;

public class BridgePattern {
    public static void main(String[] args){
        Abstraction ab = new RefinedAbstraction();
        ab.setImplementor(new ConcreteImplementorA());
        ab.Operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.Operation();
    }
}

/**
 * Implementor类
 */
abstract class Implementor{
    public abstract void Operation();
}

/**
 * ConcreteImplementorA和ConcreteImplementorB等派生类
 */
class ConcreteImplementorA extends Implementor{

    @Override
    public void Operation() {
        System.out.println("具体实现A的方法执行");
    }
}

class ConcreteImplementorB extends Implementor{

    @Override
    public void Operation() {
        System.out.println("具体实现B的方法执行");
    }
}

/**
 * Abstraction类
 */
class Abstraction{
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void Operation(){
        implementor.Operation();
    }
}

/**
 * RefinedAbstraction类
 */
class RefinedAbstraction extends Abstraction{
    @Override
    public void Operation() {
        implementor.Operation();
    }
}


