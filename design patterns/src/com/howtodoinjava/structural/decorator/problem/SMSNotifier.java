package com.howtodoinjava.structural.decorator.problem;

public class SMSNotifier extends Notifier {

	public SMSNotifier(String username) {
		super(username);
	}

	public void send(String message) {
		String phoneNum = databaseService.getPhoneNumFromUsername(getUsername());
		System.out.println("Sending " + message + " by SMS to " + phoneNum);
	}

}
