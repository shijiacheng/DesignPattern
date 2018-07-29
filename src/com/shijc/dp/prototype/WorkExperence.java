package com.shijc.dp.prototype;

import java.io.Serializable;

/**
 * 工作经历类
 */
public class WorkExperence implements Serializable {
    private String workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
