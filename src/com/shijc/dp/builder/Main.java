package com.shijc.dp.builder;

public class Main {
    public static void main(String[] args){
        PersonBuilder ptb = new PersonThinBuilder();
        PersonDirector pdThin = new PersonDirector(ptb);
        pdThin.CreatePerson();

        PersonBuilder pfb = new PersonFatBuilder();
        PersonDirector pdFat = new PersonDirector(pfb);
        pdFat.CreatePerson();
    }
}
