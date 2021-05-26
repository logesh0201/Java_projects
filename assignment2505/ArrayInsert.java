package com.onebill.corejava.assignment2505;

import java.util.Scanner;

public class ArrayInsert {

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
		// Enter the Index
		System.out.println("Index value to insert: ");
		int indexPosition = sc.nextInt();
		// Enter the value to Insert
		System.out.println("Enter the value to Insert: ");
		int value = sc.nextInt();
		for (int i = arr.length - 1; i > indexPosition; i--) {
			arr[i] = arr[i - 1];
		}
		arr[indexPosition] = value;
		// Print Array After the Insertion
		for (int i = 0; i < n+1; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
