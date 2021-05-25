package com.onebill.corejava.inheritence;

class TwoDShape1 {
	private double width;
	private double height;
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	// create accessor and mutator
	void showDimension() {
		System.out.println("Widht and Heights are: " + width + "and" + height);
	}
}

class Triangle1 extends TwoDShape1 {
	String shape;

	void showStyle() {
		System.out.println("Triangle is " + shape);
	}

	double calculateArea() {
		return getWidth() * getHeight()/ 2;
	}
}

public class ShapeNew {

	public static void main(String[] args) {
		Triangle1 t1 = new Triangle1();
		Triangle1 t2 = new Triangle1();
		System.out.println("Information of first triangel");
		t1.setWidth(5.0);
		t1.setHeight(10.0);
		t1.shape = "border";
		t1.showDimension();
		t1.showStyle();
		System.out.println(t1.calculateArea());
		System.out.println("Information of Second triangel");
		t2.setWidth(7.0);
		t2.setHeight(12.0);
		t2.shape = "border";
		t2.showDimension();
		t2.showStyle();
		System.out.println(t2.calculateArea());
	}

}
