package com.brb.main;

import java.util.Comparator;

public class Employee {

    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    private String name;
    int age;


    @Override
    public String toString(){
        return this.name + this.age;
    }
}
