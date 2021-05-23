package com.onebill.corejava.basic;

class DisplayOverloaded3{
	void display(char c, int num) {
		System.out.println("c: "+c+" num: "+num);
	}
	void display(int num, char c) {
		System.out.println("num: "+num+" c: "+c);
	}
}
public class MethodOverload3 {

	public static void main(String[] args) {
		DisplayOverloaded3 d1 = new DisplayOverloaded3();
		DisplayOverloaded3 d2 = new DisplayOverloaded3();
		d1.display('a', 100);
		d2.display(100, 'a');
	}

}
