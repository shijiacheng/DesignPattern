package com.shijc.dp.flyweight;

/**
 * 用户类，用于网站的客户账号，是“网站的外部状态”
 */
public class User {
    private String name;
    public User(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
