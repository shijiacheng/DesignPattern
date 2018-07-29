package com.shijc.dp.state;

public class StatePattern {
    public static void main(String[] args){
        Context context = new Context(new ConcreteStateA());
        context.Request();
        context.Request();
        context.Request();
        context.Request();
    }
}

/**
 * State类，抽象状态类，
 * 定义一个接口以封装与Context的一个特定状态相关的行为。
 */
abstract class State{
    public abstract void Handle(Context context);
}


/**
 * ConcreteState类，具体状态
 * 每一个子类实现一个与Context的一个状态相关的行为
 */
class ConcreteStateA extends State {

    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}

class ConcreteStateB extends State {

    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}

/**
 * Context类，维护一个ConcreteState子类的实例，
 * 这个实例定义当前的状态。
 */
class Context{
    private State state;
    // 定义Context的初始状态
    public Context(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态:"+state);
    }

    // 对请求做处理，并设置下一状态
    public void Request(){
        state.Handle(this);
    }
}