package com.howtodoinjava.structural.decorator.problem;

public class SMSAndFacebookNotifier extends Notifier {

	public SMSAndFacebookNotifier(String username) {
		super(username);
	}

	public void send(String message) {
		String phoneNum = databaseService.getPhoneNumFromUsername(getUsername());
		String fbName = databaseService.getFBNameFromUsername(getUsername());

		System.out.println("Sending " + message + " by SMS to " + phoneNum);
		System.out.println("Sending " + message + " on Facebook to " + fbName);
	}

}
