package com.onebill.corejava.basic;
import java.util.*;
class Car{
	int width;
	int height;
	int depth;
	
	public Car() {
		width = 1;
		height = 1;
		depth = 1;
	}
	public Car(int width, int height) {
		this();
		this.width = width;
		this.height = height;
	}
	public Car(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public void volume() {
		int volume = width*height*depth;
		System.out.println(volume);
	}
}
public class ThisDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the width: "); 
		int width = sc.nextInt();
		System.out.println("Enter the height: ");
		int height = sc.nextInt();
		System.out.println("Enter the depth: ");
		int depth = sc.nextInt();
		Car c1 = new Car();
		Car c2 = new Car(width,height);
		Car c3 = new Car(width,height,depth);
		c1.volume();
		c2.volume();
		c3.volume();
		sc.close();
	}

}
