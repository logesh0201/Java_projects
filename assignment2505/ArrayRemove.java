package com.onebill.corejava.assignment2505;

import java.util.Scanner;

public class ArrayRemove {

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
			System.out.println("Index index to remove:");
			int indexPosition = sc.nextInt();
			
			for (int i = indexPosition; i <arr.length-1; i++) { 
				 arr[i] = arr[i + 1]; 
				 }
			for (int i = 0; i < n-1; i++) { 
				 System.out.print(arr[i] + " "); }
			 
		}

}
