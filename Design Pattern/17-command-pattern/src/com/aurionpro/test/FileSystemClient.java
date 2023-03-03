package com.aurionpro.test;

import com.aurionpro.model.CloseFileCommand;
import com.aurionpro.model.FileInvoker;
import com.aurionpro.model.FileSystemReceiverUtil;
import com.aurionpro.model.IFileSystemReceiver;
import com.aurionpro.model.OpenFileCommand;
import com.aurionpro.model.WriteFileCommand;

public class FileSystemClient {

	public static void main(String[] args) {
		// Creating the receiver object
		IFileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

		// creating command and associating with receiver
		OpenFileCommand openFileCommand = new OpenFileCommand(fs);
		// Creating invoker and associating with Command
		FileInvoker file = new FileInvoker(openFileCommand);
		// perform action on invoker object
		file.execute();

		WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
		file = new FileInvoker(writeFileCommand);
		file.execute();

		CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
		file = new FileInvoker(closeFileCommand);
		file.execute();
	}

}
