package com.onebill.corejava.assignment2505;

public class StringImmutable {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1==s2);			  // point to the same object
		s1 = "Tutorial";
		System.out.println(s1==s2);            //point to the deferent objects that's why String is immutable

	}

}
