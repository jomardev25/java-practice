package com.jbignacio.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsNumber<T extends Number & Comparable<T>> { // bound generic; accept only integer, double, float and other numbers

	List<T> lists = new ArrayList<>();


	public void add(T value) {
		lists.add(value);
	}


	@Override
	public String toString() {
		return "GenericsNumber [lists=" + lists + "]";
	}

}
