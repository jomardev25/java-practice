package com.jbignacio.generics;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {

	private static final long serialVersionUID = 1L;

	public void sound() {

		System.out.println("Meow meow");

	}

	@Override
	public String toString() {
		return "Cat meow meow";
	}



}
