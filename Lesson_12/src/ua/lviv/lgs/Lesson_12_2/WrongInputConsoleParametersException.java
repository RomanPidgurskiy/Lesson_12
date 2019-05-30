package ua.lviv.lgs.Lesson_12_2;

public class WrongInputConsoleParametersException extends Exception{
private String message;
	
	public WrongInputConsoleParametersException(String message) {
		super(message);
		this.message = message;
	}
}
