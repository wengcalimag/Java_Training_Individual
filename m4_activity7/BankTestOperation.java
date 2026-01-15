package com.bpi.individual.m4_activity7;

@FunctionalInterface
public interface BankTestOperation {
	
	void execute() throws InvalidAmountException,	InsufficientFundsException;
	

}
