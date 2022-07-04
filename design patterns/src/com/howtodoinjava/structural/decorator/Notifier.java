package com.howtodoinjava.structural.decorator;

public class Notifier {

	private final String username;
	private final DatabaseService databaseService;

	public Notifier(String username) {
		this.username = username;
		this.databaseService = new DatabaseService();
	}

	public void send(String message) {
		String mail = databaseService.getMailFromUsername(username);
		System.out.println("Sending " + message + " by Mail to " + mail);
	}

	public String getUsername() {
		return username;
	}

}
