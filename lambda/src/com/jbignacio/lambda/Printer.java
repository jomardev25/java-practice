package com.jbignacio.lambda;

public class Printer implements Printable {

	@Override
	public String print(String prefix, String suffix) {
		System.out.println(prefix + " Printable implementation" + suffix);
		return "return string";
	}

}
