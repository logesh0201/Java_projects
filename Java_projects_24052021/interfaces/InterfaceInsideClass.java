package com.onebill.corejava.interfaces;

//this program shows interface inside the class
class Test {
	interface Demo {
		void show();
	}
}

class Testing implements Test.Demo {
	public void show() {
		System.out.println("Show method inside Interface");
	}
}

public class InterfaceInsideClass {
	public static void main(String[] args) {
		Test.Demo demo = new Testing();
		demo.show();
	}

}
