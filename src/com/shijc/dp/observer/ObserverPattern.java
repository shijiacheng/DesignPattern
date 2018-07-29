package com.shijc.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {
    public static void main(String[] args){
        ConcreteSubject s = new ConcreteSubject();
        s.Attach(new ConcreteObserver(s,"X"));
        s.Attach(new ConcreteObserver(s,"Y"));
        s.Attach(new ConcreteObserver(s,"Z"));
        s.setSubjectState("ABC");
        s.Notify();
    }
}

/**
 * Subject类，它把所有对观察者对象的引用保存在一个聚集里，每个主题都可以有任何数量的观察者，抽象主题提供一个接口，可以增加和删除观察者对象
 */
abstract class Subject{
    private List<Observer> observers = new ArrayList<>();

    public void Attach(Observer observer){
        observers.add(observer);
    }

    public void Detach(Observer observer){
        observers.remove(observer);
    }

    public void Notify(){
        for(Observer o : observers){
            o.Update();
        }
    }
}

/**
 * Observer类，抽象观察者，为所有的具体观察者定义一个接口，在得到主题的通知时更新自己。
 */
abstract class Observer{
    public abstract void Update();
}


/**
 * ConcreteSubject类，具体主题，将有关状态存入具体观察者对象；在具体主题内的内部状态改变时，给所有登记过的观察者发出通知。
 */
class ConcreteSubject extends Subject{
    // 具体被观察者的状态
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}

/**
 * ConcreteObserver类，具体观察者，实现抽象观察者角色要求的更新接口，以便使自身的状态与主题的状态相协调。
 */
class ConcreteObserver extends Observer{

    private String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject,String name){
        this.subject = subject;
        this.name = name;
    }


    @Override
    public void Update() {
        observerState = subject.getSubjectState();
        System.out.println("观察者"+name+"的新状态是"+observerState);
    }

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
}