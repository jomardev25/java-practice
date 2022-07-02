package com.jbignacio.generics;

import java.io.Serializable;

public class GenericAnimal<T extends Animal & Serializable> { // bounded generic

	private final T animal;

	public GenericAnimal(T animal) {
		this.animal = animal;
	}

	public void sound() {
		animal.eat();
		animal.sound();
	}

}
