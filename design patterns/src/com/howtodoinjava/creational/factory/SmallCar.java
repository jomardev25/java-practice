package com.howtodoinjava.creational.factory;

public class SmallCar extends Car {

	public SmallCar() {
		super(CarType.SMALL);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building Small Car");
	}

}
