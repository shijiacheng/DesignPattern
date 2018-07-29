package com.shijc.dp.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorPattern {
    public static void main(String[] args){
        ObjectStructure o = new ObjectStructure();
        o.Attach(new ConcreteElementA());
        o.Attach(new ConcreteElementB());

        ConcreteVisitor1 v1 = new ConcreteVisitor1();
        ConcreteVisitor2 v2 = new ConcreteVisitor2();

        o.Accept(v1);
        o.Accept(v2);
    }
}

/**
 * Visitor类，为该对象结构中ConcreteElement的每一个类声明一个Visit操作
 */
abstract class Visitor{
    public abstract void VisitConcreteElementA(ConcreteElementA elementA);
    public abstract void VisitConcreteElementB(ConcreteElementB elementB);
}

/**
 * ConcreteVisitor1和ConcreteVisitor2类，具体访问者，实现每个由Visitor声明的操作。每个操作实现算法的一部分，而该算法片段是对应于结构中对象的类
 */
class ConcreteVisitor1 extends Visitor {

    @Override
    public void VisitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() + "被"
                + this.getClass().getSimpleName() + "访问");
    }

    @Override
    public void VisitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName() + "被"
                + this.getClass().getSimpleName() + "访问");
    }

}

class ConcreteVisitor2 extends Visitor {

    @Override
    public void VisitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() + "被"
                + this.getClass().getSimpleName() + "访问");
    }

    @Override
    public void VisitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName() + "被"
                + this.getClass().getSimpleName() + "访问");
    }

}

/**
 * Element类，定义一个Accept操作，它以一个访问者为参数
 */
abstract class Element{
    public abstract void Accept(Visitor visitor);
}

/**
 * ConcreteElementA和ConcreteElementB类，具体元素，实现Accept操作
 */
class ConcreteElementA extends Element{

    @Override
    public void Accept(Visitor visitor) {
        visitor.VisitConcreteElementA(this);
    }

    public void OperationA(){

    }
}

class ConcreteElementB extends Element{

    @Override
    public void Accept(Visitor visitor) {
        visitor.VisitConcreteElementB(this);
    }

    public void OperationB(){

    }
}

/**
 * ObjectStructure类，能枚举它的元素，可以提供一个高层的接口以允许访问者访问它的元素
 */
class ObjectStructure{
    private List<Element> elements = new ArrayList<>();
    public void Attach(Element element){
        elements.add(element);
    }
    public void Detach(Element element){
        elements.remove(element);
    }
    public void Accept(Visitor visitor){
        for (Element e :elements) {
            e.Accept(visitor);
        }
    }
}