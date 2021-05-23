package com.onebill.corejava.basic;

public class WrapperClass {
	public static void main(String[] args) {
		int a = 20;
		Integer i = Integer.valueOf(a); //Autoboxing
		Integer j = a;
		System.out.println(a+" "+i+" "+j);
		
		Integer b = new Integer(5);
		int k = b.intValue(); //unboxing
		int l = b;
		System.out.println(b+" "+k);
		
	}
}
