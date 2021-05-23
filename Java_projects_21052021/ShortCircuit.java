package com.onebill.corejava.basic;

public class ShortCircuit {

	public static void main(String[] args) {
		if (false && true && true) {
			System.out.println("This will not print");
		} else {
			System.out.println("This wil be print because of short circuuit AND");
		}
		if (true || false || false) {
			System.out.println("This will print");
		} else {
			System.out.println("this will not print");
		}
	}

}
