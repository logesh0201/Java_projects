package com.onebill.corejava.inheritence;

class Inherit1{
	int i =10;  //public ,producted working
	void method1(){
		System.out.println("i value in superclass "+i);
	}
}
class Inherit2 extends Inherit1{
	void method2() {
		System.out.println("i value in subclass "+i*100);

	}
}
public class InheritenceDemo {

	public static void main(String[] args) {
		
		Inherit2 obj = new Inherit2();
		obj.method1();
		obj.method2();

	}

}
