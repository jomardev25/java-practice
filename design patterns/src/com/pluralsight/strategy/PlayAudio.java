package com.pluralsight.strategy;

public class PlayAudio implements PlayBehavior {

	@Override
	public void play() {
		System.out.println("Playing audio....");
	}

}
