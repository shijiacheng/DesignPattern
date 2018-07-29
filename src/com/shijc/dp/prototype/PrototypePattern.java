package com.shijc.dp.prototype;

/**
 * 客户端代码
 */
public class PrototypePattern {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype1 p1 = new ConcretePrototype1("I");
        ConcretePrototype1 c1 = (ConcretePrototype1) p1.clone();
        System.out.println("Cloned():"+c1.getId());
    }
}

/**
 * 具体原型类
 */
class ConcretePrototype1 implements Cloneable{

    private String id;
    public ConcretePrototype1(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}