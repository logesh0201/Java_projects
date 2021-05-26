package com.onebill.corejava.assignment2505;

import java.util.Arrays;
import java.util.Scanner;

public class PairSum {

	public static void main(String args[]) {
		// Reading the array from the user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array that is to be created: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		// Reading the number
		System.out.println("Enter the sum: ");
		int num = sc.nextInt();
		
		System.out.println("The array created is: " + Arrays.toString(arr));
		System.out.println("indices of the elements whose sum is: " + num);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == num && i != j) {
					System.out.println(i + ", " + j);
				}
			}
		}
	}
}
