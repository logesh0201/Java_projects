package com.onebill.corejava.nestedclasses;

class CPU {
	class RAM {
		int price = 2000;
		int manufactYear = 2020;

		void show() {
			System.out.println("Your RAM price is RS." + price + " and manufactured in " + manufactYear);
		}
	}

	class Processor {
		int price = 1500;
		int manufactYear = 2019;
		void display() {
			System.out.println("Your Processor price is RS." + price + " and manufactured in " + manufactYear);
		}
	}
}

public class ExampleNested {

	public static void main(String[] args) {
		CPU.RAM ram = new CPU().new RAM();
		CPU.Processor processor = new CPU().new Processor();
		ram.show();
		processor.display();
		
	}

}
