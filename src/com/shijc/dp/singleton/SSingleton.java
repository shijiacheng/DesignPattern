package com.shijc.dp.singleton;

/**
 * 线程安全的单例模式
 */
public class SSingleton {
    private volatile static SSingleton singleton;
    private SSingleton() {
    }
    public static SSingleton getInstance(){
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new SSingleton();
                }
            }
        }
        return singleton;
    }
}
