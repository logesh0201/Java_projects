package com.onebill.corejava.basic;

class DisplayOverloaded1 {
	void display(char c) {
		System.out.println(c);
	}

	void display(int num) {
		System.out.println(num);
	}
}
public class MethodOverload2 {
public static void main(String[] args) {
	DisplayOverloaded1 obj = new DisplayOverloaded1();
	obj.display('a');
	obj.display(100);
}
}
