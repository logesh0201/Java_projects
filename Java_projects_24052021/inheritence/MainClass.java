package com.onebill.corejava.inheritence;

class Sup{
	void who() {
		System.out.println("Who inside superclss");
	}
}
class Sub1 extends Sup{
	void who() {
		System.out.println("Who inside sub1clss");
	}
}
class Sub2 extends Sup{
	void who() {
		System.out.println("Who inside Sub2class");
	}
}
public class MainClass {

	public static void main(String[] args) {
		Sup supObj = new Sup();
		Sub1 sub1Obj = new Sub1();
		Sub2 sub2Obj = new Sub2();
		
		Sup RefObject;
		RefObject = supObj;
		RefObject.who();
		RefObject = sub1Obj;
		RefObject.who();
		RefObject = sub2Obj;
		RefObject.who();
		
	}

}
