package com.onebill.corejava.assignments2405;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row to print Pyramid: ");
		int rows = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			for(int j = rows; j>i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		sc.close();
		
	}
}
