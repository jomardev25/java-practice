package com.howtodoinjava.creational.abstract_factory;

public class USACarFactory {

	public static Car build(CarType model) {
		Car car = null;
		switch (model) {
		case SMALL:
			car = new SmallCar(Location.USA);
			break;

		case SEDAN:
			car = new SedanCar(Location.USA);
			break;

		case LUXURY:
			car = new LuxuryCar(Location.USA);
			break;

		default:
			throw new UnsupportedOperationException("Car model not supported");
		}
		return car;
	}

}