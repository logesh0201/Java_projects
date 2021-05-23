package com.onebill.corejava.basic;

class Person{
	String name;
	String address;
	
	public Person() {
		name = "not-known";
		address = "not-known";
	}
	public Person(String name) {
		this();
		this.name=name;
	}
	public Person(String name, String address) {
		this.name=name;
		this.address=address;
	}
	public String toString() {
		return "Person [name " + name +" address "+address+"] ";
	}
}
public class ThisDemo1 {
	public static void main(String[] args) {
		Person s1 = new Person();
		Person s2 = new Person("ajith");
		Person s3 = new Person("ajith", "TN");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}
}
