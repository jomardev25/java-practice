package com.jbignacio.generics;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public void sound() {

		System.out.println("Wof wof");

	}

	@Override
	public String toString() {
		return "Dog wof wof";
	}

}
