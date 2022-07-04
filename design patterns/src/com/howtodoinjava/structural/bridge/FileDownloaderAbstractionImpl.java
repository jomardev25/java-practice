package com.howtodoinjava.structural.bridge;

public class FileDownloaderAbstractionImpl implements FileDownloaderAbstraction {

	private FileDownloadImplementor provider;

	public FileDownloaderAbstractionImpl(FileDownloadImplementor provider) {
		this.provider = provider;
	}

	@Override
	public Object download(String path) {
		return provider.downloadFile(path);
	}

	@Override
	public boolean store(Object object) {
		return provider.storeFile(object);
	}

	@Override
	public boolean delete(String object) {
		return provider.delete(object);
	}

}
