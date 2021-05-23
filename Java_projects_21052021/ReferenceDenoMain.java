package com.onebill.corejava.basic;

class ReferenceDemo{
	int variable = 10;
	public int display(){
		double salary = 0.0;
		System.out.println("the value:"+variable);
		return 0;
	}
}
public class ReferenceDenoMain {
	public static void main(String[] args) {
		ReferenceDemo demo = new ReferenceDemo();
		System.out.println(demo);
		System.out.println(demo.display());
	}

}
