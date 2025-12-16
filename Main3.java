package com.bpi.individual.collections;

//December 16, 2025
//Activity #2: Practice Map Operations (M3_ACTIVITY3)


import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Main3 {

	public static void main(String[] args) {

		String menu = "";
		Scanner input = new Scanner(System.in);
		Map<String, Integer> productMap = new HashMap<>();

		productMap.put("Laptop", 50000);
		productMap.put("Monitor", 7000);
		productMap.put("Mouse", 500);
		productMap.put("Keyboard", 1000);
		productMap.put("Printer", 6000);

		while (!menu.equals("5")) {

			menuList();
			menu = input.next();

			switch (menu) {
			case "1":
				searchProduct(input, productMap);
				break;

			case "2":
				addProduct(input, productMap);
				break;

			case "3":
				displayAllProducts(productMap);
				break;

			case "4":
				findCheapest(productMap);
				break;
				
			case "5":
				System.out.print("Exiting...");
				break;
				
			default:
				System.out.println("Invalid Option! Choose from the available menu.\n");
				break;
			}

		}
		
		

		input.close();

	}
		
		
	
	
	private static void menuList() {

		System.out.println("Select an option");
		System.out.println("1. Search a product");
		System.out.println("2. Add a product");
		System.out.println("3. Print all products and prices");
		System.out.println("4. Find the cheapest product");
		System.out.println("5. Exit");
		System.out.print("> ");
	}
	
	
	private static void searchProduct(Scanner input, Map<String, Integer> prodPrice) {
	    String price = ""; 
	    String productToSearch = "";
	    
	    System.out.print("Enter Product name to search: ");
		productToSearch = input.next();
		
		if (prodPrice.containsKey(productToSearch)) {
			price = prodPrice.get(productToSearch).toString();
			System.out.println("Product found! Price: " + price + "\n");
		} else {
			System.out.println("Product not found!\n"); 
		}
		
	}

	
	private static void addProduct(Scanner input, Map<String, Integer> product) {

		System.out.print("Enter Product name to add: ");
		String productToSearch = input.next();
		System.out.print("Enter price: ");
		Integer priceOfProduct = input.nextInt();
		product.put(productToSearch, priceOfProduct);
		System.out.println("Product added : " + productToSearch + "\n");

	}
	
	
	private static void displayAllProducts(Map<String, Integer> product) {
		System.out.println("All Products: ");

		for (Map.Entry<String, Integer> entry : product.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());

		}
		System.out.println("Total Products: " + product.size() + "\n");

	}
	
	
	private static void findCheapest(Map<String, Integer> product) {

		int price = Integer.MAX_VALUE;
		String cheapestProduct = "";
		
		for (Map.Entry<String, Integer> entry : product.entrySet()) {

			if (entry.getValue() < price) {
				price = entry.getValue();
				cheapestProduct = entry.getKey();
				
			}
		}
		System.out.println("Cheapest product: " + cheapestProduct + " - " + price + "\n");

	}
	
}
