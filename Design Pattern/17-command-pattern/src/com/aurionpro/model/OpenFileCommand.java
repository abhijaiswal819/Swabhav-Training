package com.aurionpro.model;

public class OpenFileCommand implements ICommand {

	private IFileSystemReceiver fileSystem;

	public OpenFileCommand(IFileSystemReceiver fs) {
		this.fileSystem = fs;
	}

	@Override
	public void execute() {
		// open command is forwarding request to openFile method
		this.fileSystem.openFile();
	}
}
