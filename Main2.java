package com.bpi.individual.collections;

//December 15, 2025
//Activity #2: Practice Set Operations (M3_ACTIVITY2)

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
        
		String enteredValue = "";
		Scanner input = new Scanner(System.in);	
		Set<String> productList = new HashSet<>();
		
		productList.add("Laptop");
		productList.add("Mouse");
		productList.add("Keyboard");
		productList.add("Monitor");
		productList.add("Printer");
		
		while (!enteredValue.equals("4")) {
			
			menuList();
			enteredValue = input.next();
			if (enteredValue.equals("1")) {

				System.out.print("Enter Product name to search: ");
				enteredValue = input.next();
				String message = searchProduct(enteredValue, productList);
				System.out.println(message + "\r\n");
				
			} else if (enteredValue.equals("2")) {

				System.out.print("Enter Product name to add: ");
				enteredValue = input.next();
				productList.add(enteredValue);
				System.out.println("Product added : " + enteredValue + "\r\n");
				
			} else if (enteredValue.equals("3")) {
				System.out.println("All Products: ");
				for (String string : productList) {
					System.out.println(string);
				}
				System.out.println("Total Unique Products: " + productList.size() + "\r\n");				
			}
		}
		
		if (enteredValue.equals("4")) {
			System.out.print("Exiting...");
		}
			
			
		input.close();
		
}
		
		
	
	
	private static void menuList() {

		System.out.println("Select an option");
		System.out.println("1. Search a product");
		System.out.println("2. Add a product");
		System.out.println("3. Print all products and count");
		System.out.println("4. Exit");
		System.out.print("> ");
	}	
	
	
	private static String searchProduct(String product, Set<String> prodList) {
		String message = "";
		
		if (prodList.contains(product)) {
			message = "Product found: " +  product;
		} else {
			message = "Product not found!";
		}
		return message;
	}

}
