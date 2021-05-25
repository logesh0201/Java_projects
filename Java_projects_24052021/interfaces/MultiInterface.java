package com.onebill.corejava.interfaces;

//Demonstrate multiple interface
interface InterfaceOne {
	void method1();
}

interface InterfaceTwo {
	void method2();
}

interface InterfaceThree extends InterfaceOne, InterfaceTwo {
	void method3();
}

class AnotherClass implements InterfaceThree {

	@Override
	public void method1() {
		System.out.println("Method one called");

	}

	@Override
	public void method2() {
		System.out.println("Method Two called");

	}

	@Override
	public void method3() {
		System.out.println("Method Three called");

	}

}

public class MultiInterface {
	public static void main(String[] args) {
		AnotherClass myInterface = new AnotherClass();
		myInterface.method1();
		myInterface.method2();
		myInterface.method3();
	}
	
}