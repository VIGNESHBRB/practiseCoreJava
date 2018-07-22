package com.brb.main;

public class StartLearning {

    public static void main(String[] args) {

            continuedLabel:
            {
                for (int i = 0; i < 10; i++) {
                    if (i == 5) {
                        break continuedLabel;
                    }
                    System.out.println(i);
                }
            }
            System.out.println("Inside Second Block");
    }
}
