package com.shijc.dp.observer;

/**
 * 抽象公司观察者，员工
 */
public abstract class CompanyObserver {
    protected String name;
    protected  CompanySubject sub;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CompanySubject getSub() {
        return sub;
    }

    public void setSub(CompanySubject sub) {
        this.sub = sub;
    }

    public abstract void Update();
}
