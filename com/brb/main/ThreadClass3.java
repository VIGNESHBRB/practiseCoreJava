package com.brb.main;

public class ThreadClass3 extends Thread {


    @Override
    public void run() {
        for(int i =1 ; i < 100 ; i++) {
            System.out.println(i + 9999);
        }
    }
}
