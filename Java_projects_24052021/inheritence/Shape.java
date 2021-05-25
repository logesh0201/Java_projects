package com.onebill.corejava.inheritence;

class TwoDShape {
	double width;
	double height;

	void showDimension() {
		System.out.println("Widht and Heights are: " + width + "and" + height);
	}
}

class Triangle extends TwoDShape {
	String shape;

	void showStyle() {
		System.out.println("Triangle is " + shape);
	}

	double calculateArea() {
		return width * height / 2;
	}
}

public class Shape {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		System.out.println("Information of first triangel");
		t1.width = 5.0;
		t1.height = 10.0;
		t1.shape = "border";
		t1.showDimension();
		t1.showStyle();
		System.out.println(t1.calculateArea());
		System.out.println("Information of Second triangel");
		t2.width = 7.0;
		t2.height = 12.0;
		t2.shape = "border";
		t2.showDimension();
		t2.showStyle();
		System.out.println(t2.calculateArea());
	}

}
