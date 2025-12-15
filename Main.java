package com.bpi.individual.collections;

//December 15, 2025
//Activity #2: Product List (M3_ACTIVITY1)


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {

		List<String> productList = new ArrayList<>();
		
		productList.add("Laptop");
		productList.add("Mouse");
		productList.add("Keyboard");
		productList.add("Monitor");
		productList.add("Printer");
		
		System.out.println("All Products:");
		System.out.println("1. " + productList.get(0));
		System.out.println("2. " + productList.get(1));
		System.out.println("3. " + productList.get(2));
		System.out.println("4. " + productList.get(3));
		System.out.println("5. " + productList.get(4));
		
		
		productList.remove(1);
		productList.add("Webcam");
		
		System.out.println("\n");
		System.out.println("After adding and removing products:");
		System.out.println("1. " + productList.get(0));
		System.out.println("2. " + productList.get(1));
		System.out.println("3. " + productList.get(2));
		System.out.println("4. " + productList.get(3));
		System.out.println("5. " + productList.get(4));
		
		System.out.println("\n");
		
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter Product name to search: ");
		String searchProduct = input.next();
		
		if (productList.contains(searchProduct)) {
			System.out.println("Product found: " + searchProduct);
		} else {
			System.out.println("Product not found");
		}
		
	
		input.close();
	
	}

}
