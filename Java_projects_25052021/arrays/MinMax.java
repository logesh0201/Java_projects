package com.onebill.corejava.arrays;

public class MinMax {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		int min, max;
		numbers[0] = 128;
		numbers[1] = 79;
		numbers[2] = 56;
		numbers[3] = 86;
		numbers[4] = 92;
		min=max=numbers[0];
		for(int i=0; i<=4; i++) {
			if(numbers[i]<min) min= numbers[i];
			if(numbers[i]>max) max= numbers[i];
		}
		System.out.println("Minimun and Maximum values are: "+min+" "+max);
	}

}
