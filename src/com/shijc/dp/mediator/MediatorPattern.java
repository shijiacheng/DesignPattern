package com.shijc.dp.mediator;

public class MediatorPattern {
    public static void main(String[] args){
        ConcreteMediator m = new ConcreteMediator();
        ConcreteColleague1 c1 = new ConcreteColleague1(m);
        ConcreteColleague2 c2 = new ConcreteColleague2(m);

        m.setColleague1(c1);
        m.setColleague2(c2);

        c1.Send("吃过饭了吗？");
        c2.Send("没有呢");
    }
}

/**
 * Mediator类，抽象中介者类
 */
abstract class Mediator{
    public abstract void Send(String message, Colleague colleague);
}

/**
 * Colleague类，抽象同事类
 */
abstract class Colleague{
    protected Mediator mediator;
    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }
}

/**
 * ConcreteMediator类，具体中介者类
 */
class ConcreteMediator extends Mediator{

    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void Send(String message, Colleague colleague) {
        if (colleague == colleague1){
            colleague2.Notify(message);
        }else {
            colleague1.Notify(message);
        }
    }
}

/**
 * ConcreteColleague1和ConcreteColleague2等各种同事对象
 */
class ConcreteColleague1 extends Colleague{

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void Send(String message){
        mediator.Send(message,this);
    }

    public void Notify(String message){
        System.out.println("同事1得到信息："+message);
    }
}

class ConcreteColleague2 extends Colleague{

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void Send(String message){
        mediator.Send(message,this);
    }

    public void Notify(String message){
        System.out.println("同事2得到信息："+message);
    }
}