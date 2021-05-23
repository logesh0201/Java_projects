package com.onebill.corejava.basic;

import java.io.IOException;
//import java.util.Random;
import java.util.Scanner;

public class BreakContinue {
	public static void main(String[] args) throws IOException {
		char ch;
		while(true){
			ch = (char)System.in.read();
			if(ch=='q')
				break;
			
		}System.out.println("You entered 'q' Correctly!!!");
	}
}
