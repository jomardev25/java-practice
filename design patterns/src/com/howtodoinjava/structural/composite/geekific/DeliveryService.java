package com.howtodoinjava.structural.composite.geekific;

public class DeliveryService {

	private BoxInterface box;

	public DeliveryService() {

	}

	public void setupOrder(BoxInterface... boxes) {
		box = new CompositeBox(boxes);
	}

	public double calculateOrderPrice() {
		return box.calculatePrice();
	}

}
