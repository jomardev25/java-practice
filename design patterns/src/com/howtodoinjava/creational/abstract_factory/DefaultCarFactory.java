package com.howtodoinjava.creational.abstract_factory;

public class DefaultCarFactory {

	public static Car build(CarType model) {
		Car car = null;
		switch (model) {
		case SMALL:
			car = new SmallCar(Location.DEFAULT);
			break;

		case SEDAN:
			car = new SedanCar(Location.DEFAULT);
			break;

		case LUXURY:
			car = new LuxuryCar(Location.DEFAULT);
			break;

		default:
			throw new UnsupportedOperationException("Car model not supported");
		}
		return car;
	}

}