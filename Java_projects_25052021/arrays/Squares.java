package com.onebill.corejava.arrays;

public class Squares {

	public static void main(String[] args) {
		int[][] square = new int[10][2];
		int i,j;
		for(i=1;i<=10;i++) {
			for(j=1;j<2;j++) {
				System.out.print(i+" ");
				System.out.print(i*i);
			}
			System.out.println();
		}

	}

}
