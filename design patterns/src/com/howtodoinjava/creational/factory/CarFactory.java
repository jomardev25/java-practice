package com.howtodoinjava.creational.factory;

public class CarFactory {

	public static Car build(CarType model) {
		Car car = null;
		switch(model) {
			case SMALL:
				car = new SmallCar();
				break;
			case SEDAN:
				car = new SedanCar();
				break;
			case LUXURY:
				car = new LuxuryCar();
				break;
			default:
				throw new UnsupportedOperationException("Car model not supported");
		}

		return car;
	}

}
