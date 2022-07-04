package com.howtodoinjava.structural.decorator;

public class DatabaseService {

	public String getMailFromUsername(String username) {
		return username + "@mail";
	}

	public String getPhoneNumFromUsername(String username) {
		return username + "@phone";
	}

	public String getFBNameFromUsername(String username) {
		return username + "@facebook";
	}
}
