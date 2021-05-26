package com.onebill.corejava.assignment2505;

public class StringContains {

	public static void main(String[] args) {
		String str = "This Contains a String value";
		
		System.out.println("Contain Sequence 'tains': "+str.contains("tains"));
		
		System.out.println("Contain Sequence 'Tains': "+str.contains("Tains"));   //false because case sensitive
		
		System.out.println("Contain sequence 'log': "+str.contains("log"));
		
		System.out.println("Contain Sequence 'ing': "+str.contains("ing"));       //True str contains 'ing'

	}

}
