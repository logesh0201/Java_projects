package com.onebill.corejava.assignment2505;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargeSmall {
	public static int getSecondLarge(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 2];

	}
	public static int getSecondSmallest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[1];

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter the Elements: ");
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		//Arrays.sort(arr);
		System.out.println("Original Array:" + Arrays.toString(arr));
		
		System.out.println("Second Largest Number of Array :" + getSecondLarge(arr, arr.length));
		System.out.println("Second Smallest Number of Array :" + getSecondSmallest(arr, arr.length));
	}

}
