package com.onebill.corejava.stringdemo;

public class StringOperation {

	public static void main(String[] args) {
		String s1 = "Javaisfuntolearn";
		String s2 = "andearn";
		System.out.println("String Length: " + s1.length());
		System.out.println("Print index at 3 rd value: " + s1.charAt(3));
		System.out.println("Index of fun is: " + s1.indexOf("fun"));
		System.out.println("Concatination String: "+s1.concat(s2));
		boolean check= "java".equalsIgnoreCase("java");
		System.out.println(check);
		
		String s3 = "     Learn Share Learn      ";
		System.out.println("Trim the Word: " +s3.trim());
		
		String originalString = "Java Makes the web move";
		String subString = originalString.substring(15);
		System.out.println(subString);
		
		
		String s4 = "Learn";
		String s5 = "java";
		int checking = s4.compareTo(s5);
		System.out.println(checking);
		System.out.println(s5.compareTo(s4));
		
		
	}

}
