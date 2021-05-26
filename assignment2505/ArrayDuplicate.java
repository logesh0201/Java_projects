package com.onebill.corejava.assignment2505;

import java.util.Scanner;

public class ArrayDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// number of element to add in array
		System.out.println("Enter the Number of Element you want to add: ");
		int n = sc.nextInt();
		int[] arr = new int[10];

		// Enter the Values
		System.out.println("Enter the Array Value: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Print the Actual Array
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		System.out.println("Duplicate elements in given array: ");
		// Searches for duplicate element
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}
	}
}
