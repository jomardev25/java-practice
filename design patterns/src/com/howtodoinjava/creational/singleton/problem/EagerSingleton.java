package com.howtodoinjava.creational.singleton.problem;

/*
 * Singleton with eager initialization
 */
public class EagerSingleton {

	private static volatile EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {
	}

	public static EagerSingleton getInstance() {
		return instance;
	}

}
