package com.onebill.corejava.inheritence;

class Vehicle{
	void move() {
		System.out.println("Vehicle is Moving.....");
	}
}
class Bike extends Vehicle{
	void move() {
		System.out.println("Bike is Moving.....");
	}
	public static void main(String[] args) {
		Bike bikeObj = new Bike();
		bikeObj.move();

	}

}
