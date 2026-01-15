package com.bpi.individual.m4_activity8;

@FunctionalInterface
public interface BankTestOperation {
	
	void execute() throws InvalidAmountException,	InsufficientFundsException;
	

}
