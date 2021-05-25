package com.onebill.corejava.arrays;

public class ForEachDemo {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		/*
		 * for(int i = 0; i<10;i++) sum=sum+numbers[i]; System.out.println(sum);
		 */
		for(int x:numbers) {
			System.out.println("Value of x: "+x);
			sum+=x;
		}
		System.out.println("sum"+sum);
		int avg = sum/numbers.length;
		System.out.println("average: "+avg);
	}	
}
