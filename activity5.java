package com.bpi.individual;

import java.util.Scanner;

public class activity5 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.println("Enter start number: ");
		int num1 = input.nextInt();
		
		System.out.println("Enter end number: ");
		int num2 = input.nextInt();

		
		int sum = 0;
		//call method
		sum = computeSum(num1, num2);
		//display result
		System.out.println("Sum of " + num1 + " to " + num2 + ": " + sum);
		
		input.close();
	}

	//method
	public static int computeSum (int start, int end) {
		int output = 0;
		
		for (int i = start; i <= end; i++) {
		    output += i;
		}
		return output;
		
	}
}
