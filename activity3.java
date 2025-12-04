package com.bpi.individual;

import java.util.Scanner;

public class activity3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first integer: ");
		int intVal1 = input.nextInt();
		System.out.println("Enter second integer: ");
		int intVal2 = input.nextInt();
		
		
		int sum = intVal1 + intVal2;
		int diff = intVal1 - intVal2;
		int product = intVal1 * intVal2;		
		
		System.out.println("sum: " + sum);
		System.out.println("diff: " + diff);
		System.out.println("product: " + product);

		input.close();
	}

}
