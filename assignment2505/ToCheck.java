package com.onebill.corejava.assignment2505;

import java.util.Arrays;
import java.util.Scanner;

public class ToCheck {

		 private static void check(int[] arr, int toCheckValue) {
			// check if the specified element
			// is present in the array or not
			// using Linear Search method
			boolean test = false;
			for (int element : arr) {
				if (element == toCheckValue) {
					test = true;
					break;
				}
			}

			// Print the result
			System.out.println("Is " + toCheckValue + " present in the array: " + test);
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			// Get the array
			System.out.println("Enter the array value: ");
			int arr[] = new int[5];
			for(int i=0; i<arr.length;i++)
				arr[i] = sc.nextInt();

			// Get the value to be checked
			System.out.println("Enter the Number to Check: ");
			int toCheckValue =sc.nextInt();

			// Print the array
			System.out.println("Array: " + Arrays.toString(arr));

			// Check if this value is
			// present in the array or not
			check(arr, toCheckValue);
		}
	}


