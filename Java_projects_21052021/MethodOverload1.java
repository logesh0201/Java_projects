package com.onebill.corejava.basic;

class DisplayOverload {
	void display(char c) {
		System.out.println(c);
	}

	void display(char c, int num) {
		System.out.println(c + " " + num);
	}
}

public class MethodOverload1 {
	public static void main(String[] args) {
		DisplayOverload obj = new DisplayOverload();
		obj.display('a');
		obj.display('b', 100);
	}
}
