package com.jbignacio.functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {

		Predicate<String> checkLength = strInput -> strInput.length() > 5; // return boolean

		Person person = new Person();
		Consumer<Person> setName = p -> p.setName("Jonh Doe"); // no return / results
		setName.accept(person);

		Function<Integer, String> exponent = num -> num * num + " multiply by itself"; // input and output

		Supplier<Double> doubleNumber = () -> Math.random() * 100; //no input only supply data

		System.out.println(checkLength.test("Hello World"));
		System.out.println(person);
		System.out.println(exponent.apply(10));
		System.out.println(doubleNumber.get());


	}

}

class Person {

	private String name;

	public Person() {

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}
