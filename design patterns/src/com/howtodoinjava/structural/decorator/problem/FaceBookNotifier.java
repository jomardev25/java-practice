package com.howtodoinjava.structural.decorator.problem;

public class FaceBookNotifier extends Notifier {

	public FaceBookNotifier(String username) {
		super(username);
	}

	public void send(String message) {
		String fbName = databaseService.getFBNameFromUsername(getUsername());
		System.out.println("Sending " + message + " on Facebook to " + fbName);
	}

}
