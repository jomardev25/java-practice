package com.howtodoinjava.creational.abstract_factory;

public class CarFactory {

	public static Car build(CarType model, Location location) {

		Car car = null;
		switch(location) {
			case USA:
				car = USACarFactory.build(model);
				break;
			case ASIA:
				car = AsiaCarFactory.build(model);
				break;
			default:
				car = DefaultCarFactory.build(model);
		}

		return car;
	}

}
