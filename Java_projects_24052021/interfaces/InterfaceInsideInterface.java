package com.onebill.corejava.interfaces;

//Demonstarate interface inside interface
interface Outer {
	interface Inner {
		void showInsideInner();
	}

	void showInsideOuter();
}

class Demo implements Outer.Inner, Outer {

	@Override
	public void showInsideOuter() {
		System.out.println("Implements for Inner");
	}

	@Override
	public void showInsideInner() {
		System.out.println("Implements for Outer");

	}

}

public class InterfaceInsideInterface{
	public static void main(String[] args) {
		Outer outer;
		Outer.Inner inner;
		Demo demo = new Demo();
		outer = demo;
		inner = demo;
		outer.showInsideOuter();
		inner.showInsideInner();
	}
}
