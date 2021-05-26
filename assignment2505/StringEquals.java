package com.onebill.corejava.assignment2505;

public class StringEquals {

	public static void main(String[] args) {
		String s1 = "Logesh";
		String s2 = "Logesh";
		String s3 = "logesh";
		String s4 = new String("Logesh");
		
		System.out.println(s1.equals(s2));          //return true both values are same
		
		System.out.println(s1.equals(s3));          // return false because equals() is case sensitive
		
		System.out.println(s1.equalsIgnoreCase(s3));//return true because equalIgnorecase() not case sensitive
		
		System.out.println(s1==s3);					//false because both refeerence different object
		
		System.out.println(s1==s2);                 //true because both refeerence same object
		
		System.out.println(s1==s4);                 //false because both refeerence different object
		
		System.out.println(s1.compareTo(s2));	    //return 0 because same value
		
		System.out.println(s1.compareTo(s3));
		
		System.out.println(s3.compareTo(s1));
		
	}

}
