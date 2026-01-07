package com.bpi.individual;

public class BankAccount {

	public static void main(String[] args) {
		
		String accountNumber; 
		System.out.println("=== Bank Account Name Display ===");
		accountNumber = "ACC-001";
		System.out.println("\nLooking up account:" + accountNumber);
        System.out.print("Account holder: ");
        testCase(accountNumber);
        
		accountNumber = "ACC-999";
		System.out.println("\nLooking up account:" + accountNumber);
        System.out.print("Account holder: ");
        testCase(accountNumber);
        
        System.out.println("\n\n=== Program completed successfully! ===");
	}
	
	
	public static void testCase(String accountNumber) {
		String name;
		
		try {
			name = getAccountName(accountNumber).toUpperCase();
			System.out.println(name);
		} catch (Exception e) {
			System.out.println("Error: Account not found!");
		}
	}

	
	
	private static String getAccountName(String accountNumber) {

		if (accountNumber.equals("ACC-001")) {
			return "Juan Dela Cruz";
		} else if (accountNumber.equals("ACC-002")) {
			return "Maria Santos";
		} else {
			return null;

		}

	}
}
