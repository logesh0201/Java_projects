package com.onebill.corejava.assignment2505;

import java.util.Scanner;

public class ArrayReverse {

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
		
		System.out.println("Array in reverse order: "); 
		
        //Loop through the array in reverse order  
        for (int i = n-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        }  

	}

}
