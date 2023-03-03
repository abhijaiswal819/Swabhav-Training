package com.aurionpro.model;

public class UnixFileSystemReceiver implements IFileSystemReceiver {

	@Override
	public void openFile() {
		System.out.println("Opening file in UNIX OS");
	}

	@Override
	public void writeFile() {
		System.out.println("Writing file in UNIX OS");
	}

	@Override
	public void closeFile() {
		System.out.println("Closing file in UNIX OS");
	}
}
