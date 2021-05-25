package com.onebill.corejava.staticdemo;

class Employee {
	int empId;
	String empName;
	static String companyName = "Onebill";

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	void display() {
		System.out.println(empId + " " + empName + " " + companyName);
	}
}

public class StaticVariableDemo {
public static void main(String[] args) {
	Employee emp1 = new Employee(111, "Logesh");
	Employee emp2 = new Employee(222, "praveen");
	emp1.display();
	Employee.companyName = "Test-Yantra";
	emp2.display();
}
}
