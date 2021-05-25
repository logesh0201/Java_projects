package com.onebill.corejava.interfaces;

abstract class Shape {
	// members - final/non final and static and non static
	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Drwaing rectangle");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("Drwaing triangle");
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		Shape s1 = new Rectangle();
		s1.draw();
		Shape s2 = new Triangle();
		s2.draw();
	}

}
