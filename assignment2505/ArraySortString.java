package com.onebill.corejava.assignment2505;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraySortString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] arr = new String[5];
		System.out.println("Enter the String values to sort: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}
		System.out.println("Original String Array: "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorting in Ascending Order: "+Arrays.toString(arr));
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("Sorting in Descending Order: "+Arrays.toString(arr));

	}

}
