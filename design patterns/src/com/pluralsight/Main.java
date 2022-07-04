package com.pluralsight;

import com.pluralsight.strategy.MediaFile;
import com.pluralsight.strategy.PlayAnimation;
import com.pluralsight.strategy.PlayAudio;
import com.pluralsight.strategy.PlayVideo;

public class Main {

	public static void main(String[] args) {

		MediaFile mediaFile = new MediaFile(new PlayVideo());
		mediaFile.play();

		mediaFile = new MediaFile(new PlayAudio());
		mediaFile.play();

		mediaFile = new MediaFile(new PlayAnimation());
		mediaFile.play();

		mediaFile = new MediaFile(null);
		mediaFile.play();

	}

}
