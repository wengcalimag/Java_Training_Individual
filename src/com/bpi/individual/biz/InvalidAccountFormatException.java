package com.bpi.individual.biz;

@SuppressWarnings("serial")
public class InvalidAccountFormatException extends RuntimeException {
	
	public InvalidAccountFormatException (String message) {
		super(message);
	}

}
