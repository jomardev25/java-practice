package com.jbignacio.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		/*
		 * printThings(() -> { System.out.println("Printable implementation"); } ); // passing implementation of the method
		 */

		/* printThings(() -> System.out.println("Printable implementation") ); */

		Printable lambdaPrintable = (prefix, suffix ) -> {
			System.out.println(prefix + " Printable implementation " + suffix);
			return prefix + " " + suffix;
		};
		lambdaPrintable.print("Prefix", "suffix");
		//printThings(lambdaPrintable);

		AddCalculator calculator = (Integer... numbers) ->{

			int total = 0;

			for (int number : numbers) {
				total += number;
			}

			return total;

		};

		System.out.println(calculator.addNumbers(1, 2, 3, 4, 5, 6));

		List<String> str = Arrays.asList("john", "doe", "jane", "smith");
		System.out.println(str.stream().map(String::toUpperCase).collect(Collectors.toList()));

	}

	static void toUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}

	static void printThings(Printable printable) {
		printable.print("!", "!");
	}

}
