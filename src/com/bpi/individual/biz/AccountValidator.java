package com.bpi.individual.biz;

public class AccountValidator {

	public static void main(String[] args) {	
		
		System.out.println("=== Account Number Validation Test ===\n");
		testValidation("Test 1: Valid account (1234567890)", "1234567890");
		testValidation("Test 2: Too short (123)", "123");
		testValidation("Test 3: Contains letters (12345ABC90)", "12345ABC90");
		testValidation("Test 4: Contains space (1234 567890)", "1234 567890");
		testValidation("Test 5: Null value", null);
	}

	
	
	private static void validateAccountNumber(String accountNumber) throws InvalidAccountNumberException {


		if (accountNumber == null) {
			throw new NullPointerException("Warning: Account number cannot be null\n");
		} 
		
		if (!accountNumber.matches("\\d+")) {
			throw new InvalidAccountFormatException("Warning: Account number must contain only digits\n");
		}
		
		if (accountNumber.length() != 10) {
			throw new InvalidAccountNumberException("Error: Account number must be exactly 10 digits\n");
		} 
		
		//valid account number
		System.out.println("Valid account number: " + accountNumber + "\n");
		
	}
	
	
	private static void testValidation(String testName, String accountNumber) {
		try {
			System.out.println(testName);
			validateAccountNumber(accountNumber);
			
		} catch (InvalidAccountNumberException e) {		
			System.out.println(e.getMessage());
		} catch (InvalidAccountFormatException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}



	}
		
}
