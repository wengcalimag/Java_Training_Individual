package com.bpi.individual;

import java.util.Scanner;

public class activity4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your AGE: ");
		int age = input.nextInt();
		
		if (age < 18) {
			System.out.println("Minor");
		} else if (age >= 18 && age <= 59 ) {
			System.out.println("Adult");
		} else if (age >= 60 ) {
			System.out.println("Senior");
		}
		
		input.close();

	}

}
