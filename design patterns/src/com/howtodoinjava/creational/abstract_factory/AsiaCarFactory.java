package com.howtodoinjava.creational.abstract_factory;

public class AsiaCarFactory {

	public static Car build(CarType model) {
		Car car = null;
		switch (model) {
		case SMALL:
			car = new SmallCar(Location.ASIA);
			break;

		case SEDAN:
			car = new SedanCar(Location.ASIA);
			break;

		case LUXURY:
			car = new LuxuryCar(Location.ASIA);
			break;

		default:
			throw new UnsupportedOperationException("Car model not supported");
		}
		return car;
	}

}