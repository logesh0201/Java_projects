package com.onebill.corejava.assignment2505;

import java.util.Arrays;

public class ArrayRef {

	public static void main(String[] args) {
		int num1[] = {1,2,3,4,5,6,7,8,9,10};
		int num2[] = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
		System.out.println("num1 Elements: "+Arrays.toString(num1));
		System.out.println("num2 Elements: "+Arrays.toString(num2));
		num2=num1;
		System.out.println("num2 Elements after assignment: "+Arrays.toString(num2));
		num2[3]=99;
		System.out.println("num1 Elements after making change in num2: "+Arrays.toString(num1));

	}
}
