package com.shijc.dp.decorator;

public class DecoratorPattern {
    public static void main(String[] args){
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        /*
        装饰的方法是：首先用ConcreteComponent实例化对象c，然后用
        ConcreteDecoratorA的实例化对象d1来包装c，再用ConcreteDecoratorB
        的对象d2包装d1，最终执行d2的operation()
         */
        d1.setComponent(c);
        d2.setComponent(d1);
        d2.operation();
    }
}

/**
 * Component类
 */
abstract class Component {
    public abstract void operation();
}

/**
 * ConcreteComponent类
 */
class ConcreteComponent extends Component{

    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}

/**
 * Decorator类
 */
abstract class Decorator extends Component{
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        // 重写operation()，实际上执行的是Component的operation()
        if (component!=null){
            component.operation();
        }
    }
}

/**
 * ConcreteDecorator 具体实现类
 */
class ConcreteDecoratorA extends Decorator{

    //本类的独有功能，以区别于ConcreteDecoratorB
    private String addedState;
    @Override
    public void operation() {
        super.operation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}

class ConcreteDecoratorB extends Decorator{

    @Override
    public void operation() {
        super.operation();
        AddBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    //本类的独有方法，以区别于ConcreteDecoratorA
    private void AddBehavior(){

    }
}