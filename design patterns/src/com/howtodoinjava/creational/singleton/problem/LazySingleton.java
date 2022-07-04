package com.howtodoinjava.creational.singleton.problem;

public final class LazySingleton {

	private static volatile LazySingleton instance = null;

	private LazySingleton() {
	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			synchronized (LazySingleton.class) {
				// Double check
				if (instance == null) {
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}

}