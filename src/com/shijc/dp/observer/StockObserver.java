package com.shijc.dp.observer;

/**
 * 看股票的同事
 */
public class StockObserver extends CompanyObserver {

    public StockObserver(String name,CompanySubject subject){
        setName(name);
        setSub(subject);
    }

    @Override
    public void Update() {
        System.out.println(sub.getSubjectState() + name + "关闭股票详情，继续工作");
    }
}
