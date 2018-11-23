package com.brb.main;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {

    private static final long serialVersionUID = 9884838998L;

    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Do not want to serialize any data member of the class
    private transient String name;
    int age;


    @Override
    public String toString(){
        return this.name + this.age;
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) return true;
        if(!(o instanceof Employee)) return false;

        Employee emp = (Employee) o;

        return (emp.age == this.age) && (emp.name.equals(this.name));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
