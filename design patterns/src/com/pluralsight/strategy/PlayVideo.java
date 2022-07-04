package com.pluralsight.strategy;

public class PlayVideo implements PlayBehavior {

	@Override
	public void play() {
		System.out.println("Playing video....");
	}

}
