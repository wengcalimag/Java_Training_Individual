package com.bpi.individual.biz;

@SuppressWarnings("serial")
public class InvalidAccountNumberException extends Exception {

	public InvalidAccountNumberException (String message) {
		super(message);
	}

}
