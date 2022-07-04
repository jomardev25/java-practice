package com.howtodoinjava.structural.composite.geekific;

import java.util.List;

public class Box {

	private List<Box> boxes;
	private List<Product> products;

	public Box(List<Box> boxes, List<Product> products) {
		super();
		this.boxes = boxes;
		this.products = products;
	}

	public List<Box> getBoxes() {
		return boxes;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setBoxes(List<Box> boxes) {
		this.boxes = boxes;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public double calculatePrice() {
		double sum = products.stream().mapToDouble(Product::getPrice).sum();
		for (Box box : boxes) {
			sum = sum + box.calculatePrice();
		}
		return sum;
	}
}
