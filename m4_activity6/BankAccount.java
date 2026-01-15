package com.bpi.individual.m4_activity6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
	private static final Logger logger = LoggerFactory.getLogger(BankAccount.class);
	double balance = 10000;
	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		

		runTest(() -> account.deposit(5000), "Deposit");
		runTest(() -> account.withdraw(3000), "Withdrawal");
		runTest(() -> account.deposit(-500), "Deposit");
		runTest(() -> account.withdraw(20000), "Withdrawal");
		runTest(() -> account.deposit(60000), "Deposit");
		
	}

	

	private void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {

		logger.info("Withdrawal requested: ₱{}", amount);
		
		if (amount < 0) {
		  throw new InvalidAmountException("Withdrawal amount must be positive");
		}
		
		
		if (amount > balance) {
			logger.warn("Insufficient funds: ₱{} available", balance);
			throw new InsufficientFundsException("Insufficient funds for withdrawal");
			
		}
		
		balance -= amount;
		logger.info("Withdrawal completed: ₱{}, New balance: ₱{}", amount, balance);
			
			
		
	}
	
	private void deposit(double amount) throws InvalidAmountException {

		logger.info("Deposit requested: ₱{}", amount);
		if (amount <= 0) {
			logger.error("Invalid deposit amount: ₱{}", amount);
			throw new InvalidAmountException("Deposit amount must be positive");
		}
				
		if (amount > 50000) {
			logger.warn("Large deposit: ₱{} - requires verification", amount);
		}
		
		balance += amount;
		logger.info("Deposit completed: ₱{}, New balance: ₱{}", amount, balance);
	}
	
	
	private static void runTest(BankTestOperation operation, String operationName) {

		try {
			operation.execute();
		} catch (InvalidAmountException e) {
			logger.error("Deposit failed: Deposit amount must be positive", e);
		} catch (InsufficientFundsException e) {
			logger.error("Withdrawal failed: Insufficient funds for withdrawal", e);
		}
	}
	
	
	
}
