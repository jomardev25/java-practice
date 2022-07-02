package com.jbignacio.generics;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		GenericsNumber<Integer> numbers = new GenericsNumber<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);

		System.out.println(numbers.toString());


		GenericAnimal<Dog> dog = new GenericAnimal<>(new Dog());
		dog.sound();

		GenericAnimal<Cat> cat = new GenericAnimal<>(new Cat());
		cat.sound();

		print("Hey generics java");
		print(new Cat());
		print(23);
		print(89.00);

		printKeyValue(1, "One");
		printKeyValue(2, "Two");

		System.out.println(withReturnType("key-1", "$100"));

		List<Animal> animals = Arrays.asList(new Dog(), new Cat());
		printList(animals);

	}

	static <T> void print(T str){
		System.out.println(str);
	}

	static <K, V> void printKeyValue(K key, V value){
		System.out.println("Key: " + key + " Value: " + value);
	}

	static <K, V> K withReturnType(K key, V value){
		return key;
	}

	static void printList(List<? extends Animal> objetcs) {
		System.out.println(objetcs);
	}

}
