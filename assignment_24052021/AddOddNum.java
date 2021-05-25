package com.onebill.corejava.assignments2405;

import java.util.Scanner;

public class AddOddNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the N value to add: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("Sum Of all odd Natural Number between 1 and " + n + " = " + sum);
		sc.close();
	}

}
