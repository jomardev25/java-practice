package com.howtodoinjava.structural.composite.telusko;

public class Main {

	public static void main(String[] args) {

		Component hardisk = new Leaf("Hardisk", 2000);
		Component ram = new Leaf("RAM", 4000);
		Component cpu = new Leaf("CPU", 8000);

		Component monitor = new Leaf("Monitor", 3000);
		Component mouse = new Leaf("Mouse", 1500);
		Component keyboard = new Leaf("Keyboard", 1200);

		Composite periperals = new Composite("Periperals");
		Composite cabinet = new Composite("Cabinet");
		Composite motherBoard = new Composite("Mother Board");
		Composite computer = new Composite("Computer");

		periperals.addComponent(monitor);
		periperals.addComponent(mouse);
		periperals.addComponent(keyboard);

		motherBoard.addComponent(hardisk);
		motherBoard.addComponent(ram);
		motherBoard.addComponent(cpu);

		cabinet.addComponent(motherBoard);

		computer.addComponent(periperals);
		computer.addComponent(cabinet);

		computer.showPrice();
	}

}
