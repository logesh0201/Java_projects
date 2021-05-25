package com.onebill.corejava.arrays;

public class ArrayDemo1 {
public static void main(String[] args) {
	int[] sample = new int[10];
	int i;
	for(i=0;i<100;i++) //array overrun
		sample[i]=i;
		for(i=0;i<100;i++) 
			System.out.println(sample[i]);
	
}
}
