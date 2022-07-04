package com.howtodoinjava.creational.abstract_factory;

public abstract class Car {

	private CarType model;
	private Location location;

	public Car(CarType model, Location location) {
		this.model = model;
		this.location = location;
		arrangeParts();
	}

	private void arrangeParts() {

	}

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Model: " + model + " built in " + location;
	}

	protected abstract void construct();

}
