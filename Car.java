package com.bpi.individual;


public class Car {

	public static void main(String[] args) {
		
		String brandofCar = "| **Ford**          |";
        String carType1 = " Focus              |";
        String carType2 = " Everest, Explorer |";
		
        System.out.println("**Some popular car brands and the types of cars they offer  **");
        System.out.println("**============================================================");
		System.out.println("| **Brand**         | **Sedan**          | **SUV**           |");
		System.out.println("| ----------------- | ------------------ | ----------------- |" );
		
        //for no args constructor
        Car1 noArgCar = new Car1();
        noArgCar.setCarBrand(brandofCar);
        noArgCar.setCarType1(carType1);
        noArgCar.setCarType2(carType2);
        noArgCar.displayCar();
        
        
        //for parameterized constructor
		Car1 paramCar = new Car1("| **Toyota**        |", " Camry, Corolla     |", " Fortuner, RAV4    |");
		paramCar.displayCar();
		
		paramCar.setCarBrand("| **Tesla**         |");
		paramCar.setCarType1(" Model 3, Model S   |");
		paramCar.setCarType2(" Model X, Model Y  |");
		paramCar.displayCar();
		
       
	}

}
