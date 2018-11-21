package com.brb.main;

public class MainClass {

    public static void main(String[] args) {
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
