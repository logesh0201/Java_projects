package com.onebill.corejava.stringdemo;

public class StringArrays {

	public static void main(String[] args) {
		String[] sample = { "This", "is", "a", "test" };
		System.out.println("Original Array: ");
		for (String s : sample)
			System.out.print(s + " ");
		System.out.println("\n");
		sample[1] = "was";
		sample[3] = sample[3].concat(", too!");
		System.out.println("After the Modification: ");
		for (String s : sample)
			System.out.print(s + " ");
	}
}