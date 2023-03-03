package com.aurionpro.model;

public class CloseFileCommand implements ICommand {

	private IFileSystemReceiver fileSystem;

	public CloseFileCommand(IFileSystemReceiver fs) {
		this.fileSystem = fs;
	}

	@Override
	public void execute() {
		this.fileSystem.closeFile();
	}
}
