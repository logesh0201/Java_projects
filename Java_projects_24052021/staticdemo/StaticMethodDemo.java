package com.onebill.corejava.staticdemo;

class Employee1{
	int empId;
	String empName;
	static String companyName = "Onebill";
	static void changeName() {
		companyName = "Test-Yantra";
	}
	public Employee1(int empId, String empName) {
		super();
		this.empId=empId;
		this.empName =empName;
		
	}
	void display() {
		System.out.println(empId+" "+empName+" "+companyName);
	}
}
public class StaticMethodDemo {
public static void main(String[] args) {
	Employee1.changeName();
	Employee1 emp1 = new Employee1(111, "Logesh");
	Employee1 emp2 = new Employee1(222, "praveen");
	emp1.display();
	emp2.display();
}
}

