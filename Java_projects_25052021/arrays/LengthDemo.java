package com.onebill.corejava.arrays;

public class LengthDemo {

	public static void main(String[] args) {
		int[] list = new int[10];
		int[] num = {1,2,3};
		int[][] table = {
				{1,2,3},
				{4,5},
				{6,7,8,9}
		};
		System.out.println("Length of List: "+list.length);
		System.out.println("Length of num: "+num.length);
		System.out.println("Length of table: "+table.length);
		System.out.println("Length of table[0]: "+table[0].length);
		System.out.println("Length of table[1]: "+table[1].length);
		System.out.println("Length of table[2]: "+table[2].length);
	}

}
