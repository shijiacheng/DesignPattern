package com.shijc.dp.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightPattern {
    public static void main(String[] args){
        int extrinsicstate = 22;
        FlyweightFactory f = new FlyweightFactory();

        Flyweight fx = f.getFlyweight("X");
        fx.Operation(--extrinsicstate);

        Flyweight fy = f.getFlyweight("Y");
        fy.Operation(--extrinsicstate);

        Flyweight fz = f.getFlyweight("Z");
        fz.Operation(--extrinsicstate);

        UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
        uf.Operation(--extrinsicstate);
    }
}

/**
 * Flyweight类，它是所有具体享元类的超类或接口，通过这个接口，Flyweight可以接受并作用于外部状态
 *
 */
abstract class Flyweight{
    public abstract void Operation(int extrinsicstate);
}

/**
 * ConcreteFlyweight是继承Flyweight超类或实现Flyweight接口，并为内部状态增加存储空间
 */
class ConcreteFlyweight extends Flyweight{

    @Override
    public void Operation(int extrinsicstate) {
        System.out.println("具体Flyweight："+extrinsicstate);
    }
}

/**
 * UnsharedConcreteFlyweight是指那些不需要共享的Flyweight子类，因为Flyweight接口共享成为可能，，但它并不强制共享
 */
class UnsharedConcreteFlyweight extends Flyweight{
    @Override
    public void Operation(int extrinsicstate) {
        System.out.println("不共享具体Flyweight："+extrinsicstate);
    }
}

/**
 * FlyweightFactory，是一个享元工厂，用来创建并管理Flyweight对象。它主要是用来确保合理的共享Flyweight，当用户请求一个Flyweight时，FlyweightFactory对象提供一个已创建的实例或者创建一个（如果不存在的话）。
 *
 */
class FlyweightFactory{
    private Map<String,Object> flyweights = new HashMap<>();

    public FlyweightFactory(){
        flyweights.put("X",new ConcreteFlyweight());
        flyweights.put("Y",new ConcreteFlyweight());
        flyweights.put("Z",new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key){
        return (Flyweight) flyweights.get(key);
    }
}