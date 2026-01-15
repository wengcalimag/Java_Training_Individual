package com.bpi.individual.m4_activity7;

public class InsufficientFundsException extends Exception {
	
	private String message;
	private double balance;
	private double requestedAmount;
	
	public InsufficientFundsException(String message) {	
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	public double getBalance() {
		return balance;
	}
	public double getRequestedAmount() {
		return requestedAmount;
	}

}
