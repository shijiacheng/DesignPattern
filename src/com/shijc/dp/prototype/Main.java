package com.shijc.dp.prototype;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        copy();

        System.out.println("==============");

        deepCopy();
    }

    public static void copy() throws CloneNotSupportedException {
        Resume resumeA = new Resume();
        resumeA.setName("大鸟");
        resumeA.setAge(25);
        resumeA.setSex("男");
        resumeA.setWorkExperence("2015-2016","A公司");

        Resume resumeB = (Resume) resumeA.clone();
        resumeB.setWorkExperence("2016-2017","B公司");

        Resume resumeC = (Resume) resumeA.clone();
        resumeC.setWorkExperence("2017-2018","C公司");

        resumeA.display();
        resumeB.display();
        resumeC.display();
    }

    public static void deepCopy() throws IOException, ClassNotFoundException {
        Resume resumeA = new Resume();
        resumeA.setName("大鸟");
        resumeA.setAge(25);
        resumeA.setSex("男");
        resumeA.setWorkExperence("2015-2016","A公司");

        Resume resumeB = (Resume) resumeA.deepClone();
        resumeB.setWorkExperence("2016-2017","B公司");

        Resume resumeC = (Resume) resumeA.deepClone();
        resumeC.setWorkExperence("2017-2018","C公司");

        resumeA.display();
        resumeB.display();
        resumeC.display();
    }
}
