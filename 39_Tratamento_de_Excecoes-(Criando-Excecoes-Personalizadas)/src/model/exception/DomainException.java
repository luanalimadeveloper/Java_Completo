package model.exception;

// Exception - You must to handle the exception (like ParseException).
// RuntimeException - You don't need to handle the exception.

public class DomainException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
}
