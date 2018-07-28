package com.brb.main;

public class ThreadClass2 implements Runnable {
    @Override
    public void run() {
        for(int i =0 ; i < 100 ; i++) {
            System.out.println(i + 1000);
        }
    }
}
