package com.howtodoinjava.creational.singleton;

import java.io.Serializable;

public class BestSingleton implements Serializable {

	private static final long serialVersionUID = 1L;

	private BestSingleton() {
		// private constructor
	}

	private static class BestSingletonHolder {
		public static final BestSingleton INSTANCE = new BestSingleton();
	}

	public static BestSingleton getInstance() {
		return BestSingletonHolder.INSTANCE;
	}

	// invoked when you will de-serialize the object
	protected Object readResolve() {
		return getInstance();
	}

}
