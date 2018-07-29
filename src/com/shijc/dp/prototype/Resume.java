package com.shijc.dp.prototype;

import java.io.*;

/**
 * 简历类
 */
public class Resume implements Cloneable,Serializable{
    private String name;
    private String sex;
    private int age;

    // 引用工作经历对象，演示深拷贝和浅拷贝
    private WorkExperence workExperence;

    public Resume(){
        workExperence = new WorkExperence();
    }

    public void display() {
        System.out.println(this.getName() + " " + this.getSex() + " "
                + this.getAge() + "\n工作经历： "
                + this.getWorkExperence().getWorkDate() + " "
                + this.getWorkExperence().getCompany());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public WorkExperence getWorkExperence() {
        return workExperence;
    }

    public void setWorkExperence(String workDate,String company) {
        workExperence.setCompany(company);
        workExperence.setWorkDate(workDate);
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
        // 将对象写入流内
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        // 从流内读出对象
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
        return ois.readObject();
    }
}
