package com.shijc.dp.visitor;

import java.util.ArrayList;
import java.util.List;

public class PersonObjectStructure {
    //对象结构,用于访问男,女元素
    private List<Person> list = new ArrayList<>();

    public void Attach(Person person) {
        list.add(person);
    }

    public void Detach(Person person) {
        list.remove(person);
    }

    public void Display(Action action) {
        for (Person person : list) {
            person.Accept(action);
        }
    }

}
