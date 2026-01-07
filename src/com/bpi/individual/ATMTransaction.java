package com.bpi.individual;


public class ATMTransaction {

	public static void main(String[] args) {

	    System.out.println("=== ATM BALANCE INQUIRY SYSTEM ===");
	    
	    System.out.println("\n--- Test Case 1: Valid Savings Account ---");
	    checkBalance("100123456", 15000.00); //Valid Savings account (success)
	    
	    System.out.println("\n--- Test Case 2: Valid Checking Account ---");
		checkBalance("200987654", 25000.00); //Valid Checking account (success)
		
		System.out.println("\n--- Test Case 3: Invalid Account Number Format ---");
		checkBalance("ABC12345", 15000.00); //NumberFormatException (invalid format)
		
		System.out.println("\n--- Test Case 4: Empty Account Number ---");
		checkBalance("", 15000.00); //StringIndexOutOfBoundsException (empty string)

	}
	
	

	private static void checkBalance(String accountNumber, double balance) {
		
		System.out.println("Processing balance inquiry...");
		try {
			
			Integer.parseInt(accountNumber);
			char accountType = accountNumber.charAt(0);

			if (accountType == '1') {
				System.out.println("Account Type: Savings" +
						"\nAccount Number: " + accountNumber +
						"\nCurrent Balance: ₱" + balance +
						"\nBalance inquiry successful!");
				
			} else if (accountType == '2') {	
				System.out.println("Account Type: Checking" +
						"\nAccount Number: " + accountNumber +
						"\nCurrent Balance: ₱" + balance +
						"\nBalance inquiry successful!");
			} else {
				System.out.println("Account Type: Unknown");
			}
			
		} catch (NumberFormatException e) {
			System.out.println("Error: Invalid account number format! Account numbers must be numeric.");
		} catch (StringIndexOutOfBoundsException e)  {
		    System.out.println("Error: Account number is empty or invalid!");
	    }  finally {
	    	  System.out.println("\n========== RECEIPT ==========" + 
                    "\nTransaction Date: December 3, 2025" + 
                    "\nTransaction Type: Balance Inquiry" + 
                    "\nATM Location: Main Branch"  + 
                    "\nThank you for banking with us!" + 
                    "\n==============================");
		}
		
		
		
	}

}
