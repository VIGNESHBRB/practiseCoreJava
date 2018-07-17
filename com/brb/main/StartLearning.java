package com.brb.main;

public class StartLearning {

	private static int a;
	private static int b;

	static{
		a = 10;
		b = a*5;
		System.out.println("Static block is initiated in main class");
	}
	public static void main(String[] args) {
		StartLearning startLearning = new StartLearning();
		startLearning.test();
		System.out.println("B is: "+b);
	}

	private void test() {
		System.out.println("Application is working");
		LogicWorker logicWorker = new LogicWorker();
	}
}
