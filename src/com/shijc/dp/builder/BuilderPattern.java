package com.shijc.dp.builder;

import java.util.ArrayList;
import java.util.List;

public class BuilderPattern {
    public static void main(String[] args){
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        director.Construct(b1);
        Product p1 = b1.GetResult();
        p1.show();


        director.Construct(b2);
        Product p2 = b2.GetResult();
        p2.show();
    }
}

/**
 * Product类，产品类，由多个部件组成
 */
class Product{
    List<String> parts = new ArrayList<>();

    public void Add(String part){
        parts.add(part);
    }

    public void show(){
        System.out.println("产品 创建-----");
        for (String part:parts){
            System.out.println(part);
        }
    }
}

/**
 * Builder类-抽象建造者类，确定产品由两个部件PartA和PartB组成，并声明一个得到产品建造后结果的方法GetResult
 */
abstract class Builder{
    public abstract void BuildPartA();
    public abstract void BuildPartB();
    public abstract Product GetResult();
}

/**
 * ConcreteBuilder1类-具体建造者类
 */
class ConcreteBuilder1 extends Builder{

    private Product product = new Product();

    @Override
    public void BuildPartA() {
        product.Add("部件A");
    }

    @Override
    public void BuildPartB() {
        product.Add("部件B");
    }

    @Override
    public Product GetResult() {
        return product;
    }
}

/**
 * ConcreteBuilder2类-具体建造者类
 */
class ConcreteBuilder2 extends Builder{

    private Product product = new Product();

    @Override
    public void BuildPartA() {
        product.Add("部件X");
    }

    @Override
    public void BuildPartB() {
        product.Add("部件Y");
    }

    @Override
    public Product GetResult() {
        return product;
    }
}

/**
 * Director类-指挥者类
 */
class Director{
    public void Construct(Builder builder){
        builder.BuildPartA();
        builder.BuildPartB();
    }
}