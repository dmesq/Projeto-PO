package edt.textui.section;

import edt.textui.exception.TextElementException;
import edt.textui.exception.ErrorCode;

import pt.utl.ist.po.ui.Display;

public class ProcessError{

	public static void processError(TextElementException exception, int name){

		Display display = new Display();

		switch (exception.getErrorCode()){
			case ErrorCode.SECTION_NOT_FOUND:
				display.addNewLine(Message.noSuchSection(name));
				break;

			case ErrorCode.DOCUMENT_SERIALIZE_ERROR:
				display.addNewLine(Message.noSuchSection(name));
				break;

			case ErrorCode.DOCUMENT_DESERIALIZE_ERROR:
				display.addNewLine(Message.noSuchSection(name));
				break;

			case ErrorCode.FILE_CLOSE_ERROR:
				display.addNewLine(Message.noSuchSection(name));
				break;

			default:
				System.err.println("Unknown exception occurred: " + exception.getMessage());
				exception.printStackTrace();
				break;
		}

		display.display();
	}
}

