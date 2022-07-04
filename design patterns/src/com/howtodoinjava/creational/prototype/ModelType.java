package com.howtodoinjava.creational.prototype;

public enum ModelType {

	MOVIE("movie"),
	ALBUM("album"),
	SHOW("show");

	private final String value;

	private ModelType(String value) {
		this.value = value;
	}

	public String getValue() {
        return this.value;
    }

}
