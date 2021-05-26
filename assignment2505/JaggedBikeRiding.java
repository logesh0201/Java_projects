package com.onebill.corejava.assignment2505;

import java.util.Scanner;

public class JaggedBikeRiding {

	public static void main(String[] args) {
		int[][] rider = new int[2][];
		boolean bool = true;
		rider[0] = new int[20];
		rider[1] = new int[50];
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 0;
		while (bool) {
			System.out.println("Are you Rider: 1.Yes 2.No");
			int r = sc.nextInt();
			if (r == 0) {
				System.out.println("Sorry Only for Riders!!!");
			} else {
				System.out.println("Which Day you Ride? :1.Weekend 2.Weekday");
				int day = sc.nextInt();
				System.out.println("How Many KiloMeters Driven? :");
				int km = sc.nextInt();
				if (day == 1) {
					rider[day - 1][i] = km;
					i += 1;
				} else if (day == 2) {
					rider[day - 1][j] = km;
					j += 1;
				}
					int x;
					int y;
					for (x = 0; x < rider.length; x++) {
						for (y = 0; y < rider[x].length; y++) {
							if (rider[x][y] == 0) {
								continue;
							}
							System.out.print(rider[x][y] + " ");
						}
						System.out.println();
					}
				}
				System.out.println("Do you Want to Continue?: 1.Continue 0.Exit");
				int choice = sc.nextInt();
				if (choice == 0) {
					bool = false;
				}
			}

		}
	}

