package com.shijc.dp.strategy;

public class StrategyPattern {
    public static void main(String[] args){
        Context context;

        context = new Context(new ConcreteStrategyA());
        context.ContextInterface();
        context = new Context(new ConcreteStrategyB());
        context.ContextInterface();
        context = new Context(new ConcreteStrategyC());
        context.ContextInterface();
    }
}

/**
 * Strategy类，定义所有支持的算法的公共接口
 */
abstract class Strategy{
    //算法方法
    public abstract void AlgorithmInterface();
}

/**
 * ConcreteStrategy,封装了具体的算法或行为
 */
class ConcreteStrategyA extends Strategy{

    @Override
    public void AlgorithmInterface() {
        System.out.println("算法A实现");
    }
}

class ConcreteStrategyB extends Strategy{

    @Override
    public void AlgorithmInterface() {
        System.out.println("算法B实现");
    }
}

class ConcreteStrategyC extends Strategy{

    @Override
    public void AlgorithmInterface() {
        System.out.println("算法C实现");
    }
}

/**
 * Context，用一个ConcreteStrategy来配置，维护一个对Strategy对象的引用
 */
class Context{
    Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    // 上下文接口
    public void ContextInterface(){
        strategy.AlgorithmInterface();
    }
}