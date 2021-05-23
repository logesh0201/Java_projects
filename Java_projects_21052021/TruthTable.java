package com.onebill.corejava.basic;

public class TruthTable {
	public static void main(String[] args) {
		boolean A,B;
		System.out.println("A\t| B\t| A&B\t| A|B\t| A^B");
		System.out.println("--------------------------------------");
		A=true;	B=true;
		System.out.println(A+"\t| "+B+"\t| "+(A&B)+"\t| "+(A|B)+"\t| "+(A^B));
		System.out.println("--------------------------------------");
		A=true;	B=false;
		System.out.println(A+"\t| "+B+"\t| "+(A&B)+"\t| "+(A|B)+"\t| "+(A^B));
		System.out.println("--------------------------------------");
		A=false;	B=true;
		System.out.println(A+"\t| "+B+"\t| "+(A&B)+"\t| "+(A|B)+"\t| "+(A^B));
		System.out.println("--------------------------------------");
		A=false;	B=false;
		System.out.println(A+"\t| "+B+"\t| "+(A&B)+"\t| "+(A|B)+"\t| "+(A^B));
		System.out.println("--------------------------------------");

	}
}
