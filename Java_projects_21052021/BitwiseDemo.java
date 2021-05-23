package com.onebill.corejava.basic;

public class BitwiseDemo {

	public static void main(String[] args) {
		int first = 1;
		int second = 2;
		int third = 3;
		
		first |=4;
		second >>=1;
		third <<=1;
		first ^=third;
		System.out.println("first:" +first);
		System.out.println("Second:"+second);
		System.out.println("thirs:"+third);
	}

}
