package com.aurionpro.model;

public class WriteFileCommand implements ICommand {

	private IFileSystemReceiver fileSystem;

	public WriteFileCommand(IFileSystemReceiver fs) {
		this.fileSystem = fs;
	}

	@Override
	public void execute() {
		this.fileSystem.writeFile();
	}
}
