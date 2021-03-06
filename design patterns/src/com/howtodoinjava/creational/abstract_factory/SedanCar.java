package com.howtodoinjava.creational.abstract_factory;

public class SedanCar extends Car {

	public SedanCar(Location location) {
		super(CarType.SEDAN, location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building Sedan Car");
	}

}
