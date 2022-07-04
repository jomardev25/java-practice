package com.pluralsight.strategy;

public class MediaFile {

	private PlayBehavior behavior;

	public MediaFile(PlayBehavior behavior) {
		this.behavior = behavior;
	}


	public void play() {

		if(behavior == null)
			System.out.println("Play behavior not supported.");
		else
			behavior.play();

	}

}
