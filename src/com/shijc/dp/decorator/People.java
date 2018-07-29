package com.shijc.dp.decorator;

/**
 * People类，ConcreteComponent
 */
public class People extends Component{

    public People(){}
    private String name;

    public People(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("装饰的是"+name);
    }
}
