package edt.textui.main;

import edt.textui.exception.TextElementException;

import pt.utl.ist.po.ui.Display;

public class ProcessError{

	public static void processError(TextElementException exception, String name){

		Display display = new Display();

		switch (exception.getErrorCode()){
			case "DOCUMENT_NOT_FOUND":
				display.addNewLine(Message.fileNotFound(name));

			case "DOCUMENT_DESERIALIZE_EXCEPTION":
				display.addNewLine(Message.fileNotFound(name));

			case "DOCUMENT_SERIALIZE_EXCEPTION":
				display.addNewLine(Message.fileNotFound(name));

			case "FILE_CLOSE_EXCEPTION":
				display.addNewLine(Message.fileNotFound(name));

			default:
				System.err.println("Unknown exception occurred: " + exception.getMessage());
				exception.printStackTrace();
		}

		display.display();
	}
}