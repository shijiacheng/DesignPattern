package com.shijc.dp.builder;

/**
 * 指挥着，用来控制建造过程
 */
public class PersonDirector {
    private PersonBuilder pb;
    public PersonDirector(PersonBuilder pb){
        this.pb = pb;
    }

    public void CreatePerson(){
        pb.BuildHead();
        pb.BuildBody();
        pb.BuildArmLeft();
        pb.BuildArmRight();
        pb.BuildLegLeft();
        pb.BuildLegRight();
    }
}
