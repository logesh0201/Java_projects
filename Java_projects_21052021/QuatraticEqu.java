package com.onebill.corejava.basic;

import static java.lang.Math.*;

public class QuatraticEqu {
	public static void main(String[] args) {
		double a = 1;
		double b = 5;
		double c = 2;
		double d = (b*b)-(4*a*c);
		double root1 =(-b+(sqrt(d)))/(2*a);
		double root2 =(-b-(sqrt(d)))/(2*a);
		System.out.println(root1+" "+ root2);
	}
}
