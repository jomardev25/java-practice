package com.howtodoinjava.creational.builder;

public class Main {

	public static void main(String[] args) {

		User user1 = User.builder()
					.age(30)
					.firstName("John")
					.lastName("Doe")
					.phone("444222")
					.address("Fake address 1234")
					.build();


		User user2 = User.builder()
					.firstName("Jane")
					.lastName("Smith")
					.phone("8952771")
					.address("107 Road 5 Joseph Sitt")
					.build();

		System.out.println(user1);
		System.out.println(user2);

	}

}
