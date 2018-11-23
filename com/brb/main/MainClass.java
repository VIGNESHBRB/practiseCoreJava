package com.brb.main;

import java.io.*;
import java.util.*;

public class MainClass {

    public static void main(String[] args) {
        practiseThreads();
        practiseComparable();
        practiseComparator();
        serializationAndDeserialization();
        practiseEqualsAndHashcode();
    }

    private static void practiseEqualsAndHashcode() {
        Set<Employee> equalsTestSet = new HashSet<>();
        Employee e1 = new Employee("VB", 25);
        Employee e2 = new Employee("VB", 25);

        equalsTestSet.add(e1);
        equalsTestSet.add(e2);

        System.out.println(equalsTestSet.size());
    }

    private static void serializationAndDeserialization() {
        Employee serEmp = new Employee("Vignesh Babu B R B", 25);
        try {
            FileOutputStream fileOut = new FileOutputStream("serializeTest.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(serEmp);
            objOut.close();
            fileOut.close();
            System.out.println("Serialized an Object");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Employee deSerialEmp = null;
        try {
            FileInputStream fileOut = new FileInputStream("serializeTest.txt");
            ObjectInputStream objOut = new ObjectInputStream(fileOut);
            deSerialEmp = (Employee) objOut.readObject();
            objOut.close();
            fileOut.close();
            System.out.println("DeSerialized an Object");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(deSerialEmp);
    }

    private static void practiseComparator() {
        Employee e = new Employee("VB", 25);
        Employee e2 = new Employee("Sanji", 50);
        Employee e3 = new Employee("SD", 24);

        List<Employee> list1 = new ArrayList<>();
        list1.add(e);
        list1.add(e2);
        list1.add(e3);

        System.out.println(list1);
        // sort using comparator
        EmployeeComparator comparator = new EmployeeComparator();
        Collections.sort(list1, comparator);
        System.out.println(list1);
    }

    private static void practiseComparable() {
        Movie m = new Movie("Avatar", 2010);
        Movie m2 = new Movie("Sarkar", 2018);
        Movie m3 = new Movie("NNN", 1982);

        List<Movie> list = new ArrayList<>();
        list.add(m);
        list.add(m2);
        list.add(m3);

        System.out.println(list);
        // sorted using comparable
        Collections.sort(list);
        System.out.println(list);
    }

    private static void practiseThreads() {
        ThreadClass1 threadClass = new ThreadClass1();
        ThreadClass2 threadClass2 = new ThreadClass2();
        ThreadClass3 threadClass3 = new ThreadClass3();
        Thread t1, t2;
        t1 = new Thread(threadClass);
        t2 = new Thread(threadClass2);
        t1.start();
        t2.start();
        threadClass3.start();
        System.out.println("Completed Threads");
    }
}
