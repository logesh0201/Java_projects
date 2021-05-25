package com.onebill.corejava.stringdemo;

public class StringDemo {

	public static void main(String[] args) {
		String str = "Onebill";
		
		StringBuffer sbr = new StringBuffer(str); // String to StringBuffer
		sbr.reverse();
		System.out.println(sbr);

		StringBuilder sbr1 = new StringBuilder(str); //String to StringBuider
		sbr1.append(" for freshers");
		System.out.println(sbr1);
		
		StringBuffer sb = new StringBuffer("Demo");
		StringBuilder sb1 = new StringBuilder("demo1");
		
		String sb_String = sb.toString();
		System.out.println("StringBuffer to String: "+sb_String);
		
		String sb1_String = sb.toString();
		System.out.println("StringBuilder to String: "+sb1_String);
		
		//convert StringBuffer to StringBuilder first converting to String
		//already convert String Buffer to String
		//then String to StringBuilder
		StringBuilder sb4 = new StringBuilder(sb_String);
		System.out.println(sb4);
	}

}
