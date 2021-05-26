package com.onebill.corejava.assignment2505;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// number of element to add in array
		int[] arr = new int[5];

		// Enter the Values
		System.out.println("Enter the Array Value: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// Print the Actual Array
		System.out.println("Original Array: "+Arrays.toString(arr));
		System.out.println();
		Arrays.sort(arr);
		System.out.println("After Sorting: "+Arrays.toString(arr));
		
		

	}

}
