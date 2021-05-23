package com.onebill.corejava.basic;

import java.io.IOException;

public class keyboardInput {
	public static void main(String[] args) {
		char ch;
		System.out.println("Enter a character: ");
		try {
			ch = (char) System.in.read();
			System.out.println("You have entered: "+ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
