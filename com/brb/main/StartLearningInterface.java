package com.brb.main;

public interface StartLearningInterface {

    void printString(String inputString);

    default void printDefaultString() {
        System.out.println("Print");
    }

    void printVar(String inputString, Integer outputInteger);
}
