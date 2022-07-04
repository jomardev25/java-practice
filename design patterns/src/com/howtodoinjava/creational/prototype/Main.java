package com.howtodoinjava.creational.prototype;


public class Main {

	public static void main(String[] args) {

		try {

			Movie movie = new Movie();
			movie.setName("Red Planet");

			Movie movieClone = movie.clone();

			System.out.println("Original: " + movie);
			System.out.println("Clone: " + movieClone);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
