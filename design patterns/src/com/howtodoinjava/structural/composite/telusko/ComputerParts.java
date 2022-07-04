package com.howtodoinjava.structural.composite.telusko;

import java.util.ArrayList;
import java.util.List;

interface Component{
	void showPrice();
}

class Leaf implements Component {

	private double price;
	private String name;

	public Leaf(String name, double price) {
		super();
		this.price = price;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public void showPrice() {
		System.out.println(name + ": " + price);
	}

}

class Composite implements Component {

	private String name;
	private List<Component> components = new ArrayList<>();

	public void addComponent(Component component) {
		components.add(component);
	}

	public Composite(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void showPrice() {
		System.out.println(name);
		components.forEach(component -> { component.showPrice();  });
	}

}



