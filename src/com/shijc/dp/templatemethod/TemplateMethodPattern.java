package com.shijc.dp.templatemethod;

/**
 * 客户端调用
 */
public class TemplateMethodPattern {
    public static void main(String[] args){
        AbstractClass c;
        c = new ConcreteClassA();
        c.TemplateMethod();

        c = new ConcreteClassB();
        c.TemplateMethod();

    }
}

/**
 * AbstractClass是抽象类，其实也就是一抽象模版，定义并实现了一个模板方法。这个模板方法一般是一个具体方法，它给出一个顶级逻辑的骨架，而逻辑的组成步骤在相应的抽象操作中，推迟到子类实现。
 */
abstract class AbstractClass{
    public abstract void PrimitiveOperation1();
    public abstract void PrimitiveOperation2();

    public void TemplateMethod(){
        PrimitiveOperation1();
        PrimitiveOperation2();
        System.out.println("------");
    }
}

/**
 * ConcreteClass，实现父类所定义的一个或多个抽象方法。
 */
class ConcreteClassA extends AbstractClass{

    @Override
    public void PrimitiveOperation1() {
        System.out.println("具体类A实现1方法");
    }

    @Override
    public void PrimitiveOperation2() {
        System.out.println("具体类A实现2方法");
    }
}

class ConcreteClassB extends AbstractClass{

    @Override
    public void PrimitiveOperation1() {
        System.out.println("具体类B实现1方法");
    }

    @Override
    public void PrimitiveOperation2() {
        System.out.println("具体类B实现2方法");
    }
}