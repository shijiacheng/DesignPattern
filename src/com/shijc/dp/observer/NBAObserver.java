package com.shijc.dp.observer;

/**
 * 看NBA的同事
 */
public class NBAObserver extends CompanyObserver {

    public NBAObserver(String name, CompanySubject subject){
        setName(name);
        setSub(subject);
    }

    @Override
    public void Update() {
        System.out.println(sub.getSubjectState() + name + "关闭NBA直播，继续工作");
    }
}
