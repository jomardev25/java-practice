package com.howtodoinjava.structural.composite.geekific;

public abstract class Product implements BoxInterface {

	protected final String title;
	protected final double price;

	public Product(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

}
