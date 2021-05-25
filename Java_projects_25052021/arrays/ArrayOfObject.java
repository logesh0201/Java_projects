package com.onebill.corejava.arrays;

class Student{
	int rollNo;
	String name;
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
}
public class ArrayOfObject {

	public static void main(String[] args) {
		Student[] arr = new Student[3];
		arr[0] = new Student(1, "Rohit");
		arr[1] = new Student(2, "Virat");
		arr[2] = new Student(3, "Dhoni");
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i].rollNo+" "+arr[i].name);
		}
	}

}
