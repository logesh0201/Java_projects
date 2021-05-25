package com.onebill.corejava.assignments2405;

import java.util.Scanner;

public class FloydTriangle {
	public static void main(String[] args) {
		int num = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows to print Floyd's Triangle: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}
}
