package com.onebill.corejava.basic;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) throws IOException {
		Random rand = new Random();
		while (true) {
			char randomchar = (char) (rand.nextInt(26) + 'a');
			System.out.println("Enter Your character to Guess: ");
			char userchar = (char) System.in.read();
			if (randomchar == userchar) {
				System.out.println("Your Guessing Correct!!!");
			} else if (randomchar != userchar) {
				System.out.println("Your Guessing is Wrong");
			}
			System.out.println("Do you continue then press 1 else 0");
			Scanner sc = new Scanner(System.in);
			int yourChoice = sc.nextInt();
			if(yourChoice==0) {
					break;
			}else{
				continue;			
			}
			
		}
	}
}
