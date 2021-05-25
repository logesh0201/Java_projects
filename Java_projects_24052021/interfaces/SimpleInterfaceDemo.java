package com.onebill.corejava.interfaces;

interface MyInterface {
	// members - only static and final, public
	void myMethod1(); // abstact by default

	void myMethod2();
}

public class SimpleInterfaceDemo implements MyInterface {
	public static void main(String[] args) {
		MyInterface myInterface = new SimpleInterfaceDemo();
		myInterface.myMethod1();
		myInterface.myMethod2();
	}

	@Override
	public void myMethod1() {
		System.out.println("Implementation of method1");

	}

	@Override
	public void myMethod2() {
		System.out.println("Implementation of method2");

	}
}
