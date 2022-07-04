package com.howtodoinjava.structural.bridge;

public class Main {

	public static void main(String[] args) {
		final String OS = "windows";
		final FileDownloaderAbstraction downloader;

		switch (OS) {
			case "linux":
				downloader = new FileDownloaderAbstractionImpl(new LinuxFileDownloadImplementor());
				break;
			case "windows":
				downloader = new FileDownloaderAbstractionImpl(new WindowsFileDownloadImplementor());
				break;
			default:
				throw new UnsupportedOperationException("OS not supported!");
		}

		Object object = downloader.download("Some Path");
		downloader.store(object);
		downloader.delete("Some Path");
	}

}
