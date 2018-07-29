package com.shijc.dp.observer;

/**
 * 抽象公司通知者，老板
 */
public abstract class CompanySubject {
    public abstract void Attach(CompanyObserver observer);
    public abstract void Detach(CompanyObserver observer);
    public abstract void Notify();

    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
