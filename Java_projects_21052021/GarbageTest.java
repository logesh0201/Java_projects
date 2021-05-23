package com.onebill.corejava.basic;

public class GarbageTest {
public static void main(String[] args) {
	GarbageTest t1 = new GarbageTest();
	GarbageTest t2 = new GarbageTest();
	t1= null;
	
	System.gc();
	t2 = null;
	Runtime.getRuntime().gc();
}
protected void finalize() throws Throwable{
	System.out.println("Garbage Collector Called!");
	
}
}
