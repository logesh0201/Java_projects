package com.onebill.corejava.inheritence;

class First{
	int i;
}
class Second extends First{
	int i;
	Second(int a, int b){
		super.i=a;
		i=b;
	}
	void show() {
		System.out.println("i in superclass " +super.i);
		System.out.println("i in subclass " +i);
	}
}
public class SuperUsage {

	public static void main(String[] args) {
		Second obj = new Second(1, 2);
		obj.show();

	}

}
