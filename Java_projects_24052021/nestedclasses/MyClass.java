package com.onebill.corejava.nestedclasses;

class OuterDemo{
	int number;
	class InnerDemo{
		void print() {
			System.out.println("This is inside the inner class");
		}
	}
	//accesiing the inner class using method
	void display() {
		InnerDemo innerDemo = new InnerDemo();
		innerDemo.print();
	}
}
public class MyClass {

	public static void main(String[] args) {
		OuterDemo outerDemo = new OuterDemo();
		outerDemo.display();

		
	}

}
