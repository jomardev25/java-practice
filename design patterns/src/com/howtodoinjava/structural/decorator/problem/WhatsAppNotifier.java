package com.howtodoinjava.structural.decorator.problem;

public class WhatsAppNotifier extends Notifier {

	public WhatsAppNotifier(String username) {
		super(username);
	}

	public void send(String message) {
		String phoneNum = databaseService.getPhoneNumFromUsername(getUsername());
		System.out.println("Sending " + message + " by whatsapp to " + phoneNum);
	}

}
