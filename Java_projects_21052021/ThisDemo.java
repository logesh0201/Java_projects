package com.onebill.corejava.basic;

class Student{
	int rollNo;
	String name;
	float salary;
	
	public Student(int rollNo, String name, float salary) {
		this.rollNo = rollNo;
		this.name = name;
		this.salary = salary;
	}
		void display() {
			System.out.println(rollNo+" "+name+" "+salary);
		}
	}
public class ThisDemo {
public static void main(String[] args) {
	Student s1 = new Student(101,"ajith",5000f);
	s1.display();
}
}
