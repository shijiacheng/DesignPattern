package com.shijc.dp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体通知者，可能是老板也可能是前台
 */
public class Boss extends CompanySubject {
    private List<CompanyObserver> observers = new ArrayList<>();
    @Override
    public void Attach(CompanyObserver observer) {
        observers.add(observer);
    }

    @Override
    public void Detach(CompanyObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void Notify() {
        for (CompanyObserver o:observers){
            o.Update();
        }
    }

}
