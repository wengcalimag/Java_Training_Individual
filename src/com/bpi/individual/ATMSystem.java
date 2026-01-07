package com.bpi.individual;

public class ATMSystem {

	public static void main(String[] args) {
	
        System.out.println("=== ATM Withdrawal System ===");
        
        System.out.println("\n--- Test 1: Valid Withdrawal ---");
		processWithdrawal("1", "5000");
		
        System.out.println("\n--- Test 2: Invalid Account Index ---");
		processWithdrawal("abc", "5000");
		
        System.out.println("\n--- Test 3: Account Not Found ---");
		processWithdrawal("10", "5000");
		
        System.out.println("\n--- Test 4: Insufficient Funds ---");
		processWithdrawal("1", "20000");
		
		
		System.out.println("\n=== All tests completed! ===");
	}

	
	private static void processWithdrawal(String accountIndex, String amountInput) {
		
		System.out.println("Account=" + accountIndex + ", Amount=" + amountInput);
		
		try {
			double[] accounts = {10000, 15000, 20000};
			int index = Integer.parseInt(accountIndex);
			double amount = Double.parseDouble(amountInput);
			double balance = accounts[index];
			double newBalance = balance - amount;
			
			System.out.println("Current balance: ₱" + balance + 
					          "\nWithdrawal: ₱" + amount);
			
			if (amount > balance) {
			   System.out.println("Insufficient funds! Cannot withdraw ₱" + amount);
			} else {			
				System.out.println("New balance: ₱" + newBalance +
						           "\nWithdrawal successful!");				
			}
			
		} catch (NumberFormatException e) {
			System.out.println("Error: Invalid input!\r\n"
					+ "Please enter valid numbers.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Account not found!\r\n"
					+ "Invalid account index.");
		} catch (Exception e) {
			System.out.println("Transaction failed");
		}
		
	}
}
