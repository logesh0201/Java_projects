package com.onebill.corejava.nestedclasses;

//Simple Nested class Demo
class Outer {
	class Inner {
		public void show() {
			System.out.println("Inside nested class");
		}
	}
}

public class OuterInnerMain {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		// Outer.Inner inner = new Outer().new Inner();
		inner.show();
	}
}
