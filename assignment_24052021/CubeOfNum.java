package com.onebill.corejava.assignments2405;

import java.util.Scanner;

public class CubeOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number to Perform Cube Operation: ");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			System.out.print(i*i*i+" ");
		}
		sc.close();
	}

}
