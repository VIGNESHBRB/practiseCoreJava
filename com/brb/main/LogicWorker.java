package com.brb.main;

public class LogicWorker implements StartLearningInterface{

    public LogicWorker() {
        System.out.println("Constructor is created");
    }
    //When there is no Constructor provided compiler creates default constructor
    static final String STATIC_STRING = "Test Static String";
    final String testStringFinal = "Test";

    static{
        System.out.println("Class is created");
    }

    /*Override is not mandatory. Its retention policy is SOURCE so this annotation will not be
	   available in class file. It is only used for letting us know that the method is implemented
	   from interface or superclass*/

    @Override //It is not compulsory. But good practise.
    public void printString(String inputString) {
        System.out.println(inputString);
    }
}
