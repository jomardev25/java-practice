package com.howtodoinjava.structural.composite.geekific;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeBox implements BoxInterface {

	private final List<BoxInterface> children = new ArrayList<>();

	public CompositeBox(BoxInterface... boxes) {
		children.addAll(Arrays.asList(boxes));
	}

	public double calculatePrice() {
		return children.stream().mapToDouble(BoxInterface::calculatePrice).sum();
	}
}
