package com.howtodoinjava.creational.abstract_factory;


public class Main {

	public static void main(String[] args) {

		System.out.println(CarFactory.build(CarType.SMALL, Location.ASIA));
		System.out.println(CarFactory.build(CarType.SEDAN, Location.USA));
		System.out.println(CarFactory.build(CarType.LUXURY, Location.DEFAULT));

	}

}
