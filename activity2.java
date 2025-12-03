package com.bpi.individual;

import java.util.Scanner;

public class activity2 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.println("Enter your age: ");
		int intValue = input.nextInt();
		double doubleValue = (double) intValue;

		
		System.out.println("Your age as int: " + intValue);
		System.out.println("Your age as double: " + doubleValue);

		input.close();
				
	}

}
