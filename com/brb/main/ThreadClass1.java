package com.brb.main;

public class ThreadClass1  implements Runnable {

    @Override
    public void run() {
        String[] s = {"A", "B", "C", "D"};
        for(int i =0; i < 100; i++) {
            for(String si : s) {
                System.out.println(i +si);
            }
        }
    }
}
