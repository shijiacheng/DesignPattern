package com.shijc.dp.proxy;

/**
 * 客户端代码
 */
public class ProxyPattern {
    public static void main(String[] args){
        ProxyI proxyI = new ProxyI();
        proxyI.Request();
    }
}

/**
 * Subject类，定义了RealSubject和Proxy的共用接口，
 * 这样就在任何使用RealSubject的地方都可以使用Proxy
 */
abstract class Subject{
    public abstract void Request();
}

/**
 * RealSubject类，定义Proxy所代表的真实实体
 */
class RealSubject extends Subject{

    @Override
    public void Request() {
        System.out.println("真实的请求");
    }
}

/**
 * Proxy类，保存一个引用使得代理可以访问实体，
 * 并提供一个与Subject的接口相同的接口，
 * 这样代理就可以用来替代实体
 */
class ProxyI extends Subject{
    private RealSubject realSubject;

    @Override
    public void Request() {
        if (realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.Request();
    }
}