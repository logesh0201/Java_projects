package com.onebill.corejava.basic;

import java.io.IOException;
import java.util.Scanner;

public class ConrtolStat {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Choose the below:\n1. Selection Statement\n2.Iteration Statement\n3.Jump Statement");
			int controlStat = sc.nextInt();
			switch (controlStat) {
			case 1:
				System.out.println("Selection Statement");
				System.out.println("A.if\nB.if-else\nC.nested-if\nD.switch");
				char selectStat = (char) System.in.read();
				switch (selectStat) {
				case 'A' | 'a':
					System.out.println("If Statement");
					System.out.println("------------------------------------");
					System.out.println("if(<condition>) {  \r\n" + "//block of code  \r\n" + "}  ");
					break;
				case 'B' | 'b':
					System.out.println("If-else Statement");
					System.out.println("------------------------------------");
					System.out.println("if(<condition>) {  \r\n" + "//block of code  \r\n" + "}  else {  \r\n"
							+ "//block of code  \r\n" + "}  ");
					break;
				case 'C' | 'c':
					System.out.println("Nested-if Statement");
					System.out.println("------------------------------------");
					System.out.println("if(<condition>){ "
							+ "if(<condition>) { "
							+ "//block of code"
							+ "  }  else if(<condition>) {"
							+ "//block of code } else { "
							+ "//block of code }  ");
					break;
				case 'D' | 'd':
					System.out.println("Switch Statement");
					System.out.println("------------------------------------");
					System.out.println("switch <variable> {/r/n	Case <option 1>:/r/n "
							+ "block of statements/r/n../r/n../r/n ../r/nCase <option n>:/r/n "
							+ "block of statements/r/n Default:/r/n block of statements/r/n } ");
					break;
				}
				break;

			case 2:
				System.out.println("Iteration Statement");
				System.out.println("A.For\nB.While\nC.do-While");
				char IterateStat = (char) System.in.read();
				switch (IterateStat) {
				case 'A' | 'a':
					System.out.println("for");
					System.out.println("------------------------------------");
					System.out.println("for(<initialization>, <condition>, <increment/decrement>) {  \r\n"
							+ "//block of statements  \r\n" + "} ");
					break;
				case 'B' | 'b':
					System.out.println("while");
					System.out.println("------------------------------------");
					System.out.println("While(<condition>){  \r\n" + "//loop statements  \r\n" + "}  ");
					break;
				case 'C' | 'c':
					System.out.println("do-while");
					System.out.println("------------------------------------");
					System.out.println("do   \r\n" + "{  \r\n" + "//statements  \r\n" + "} while (<Condition>);  ");
					break;
				}
				break;

			case 3:
				System.out.println("Jump Statement");
				System.out.println("A.break\nB.continue");
				char jumpStat = (char) System.in.read();
				switch (jumpStat) {
				case 'A' | 'a':
					System.out.println("break");
					System.out.println("------------------------------------");
					System.out.println("break;\r\n");
					break;
				case 'B' | 'b':
					System.out.println("continue");
					System.out.println("------------------------------------");
					System.out.println("continue;\r\n");
					break;
				}
			}
		}
	}
}
