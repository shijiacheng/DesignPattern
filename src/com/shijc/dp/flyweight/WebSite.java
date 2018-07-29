package com.shijc.dp.flyweight;

/**
 * 网站抽象类
 */
public abstract class WebSite {
    // “使用”方法需要传递“用户”对象
    public abstract void Use(User user);
}
