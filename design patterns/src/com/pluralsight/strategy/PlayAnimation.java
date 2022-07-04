package com.pluralsight.strategy;

public class PlayAnimation implements PlayBehavior {

	@Override
	public void play() {
		System.out.println("Playing animation....");
	}

}
