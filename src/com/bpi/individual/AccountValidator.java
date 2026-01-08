package com.bpi.individual;

public class AccountValidator {

	public static void main(String[] args) throws Exception {	
		
			validateAccountNumber("1234567890");
			validateAccountNumber("123");
			validateAccountNumber(null);
			
	}

	
	
	private static void validateAccountNumber(String accountNumber) throws Exception {

		 try {
			if (accountNumber.length() != 10) {
				throw new Exception ("Error: Must be 10 digits");
			} else {
				System.out.println("Valid account number: " + accountNumber);
			}
		 } catch (NullPointerException e) {
			 System.out.println("Error: Cannot be null");
		 } catch (Exception e) {
				System.out.println(e.getMessage());
		 }
		
	}
	
		
}
