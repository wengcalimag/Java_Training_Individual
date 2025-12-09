package com.bpi.individual.m2exercise2;


public class Exercise2 {

	public static void main(String[] args) {
		
	 Vehicle truck = new Truck(6, "Ford");
	 Vehicle car = new Car(4, "Honda"); 
     
	 //truck:
	 runVehicle(truck);
	 refuelVehicle(truck);
	 destroyVehicle(truck);
	 
	 System.out.println("----------------------------------------------");
	 //car:
	 runVehicle(car);
	 refuelVehicle(car);
	 destroyVehicle(car);
	 
	}

	
	private static void runVehicle(Vehicle vehicle) {
		
		vehicle.startEngine();
		
	}
	
	
	private static void refuelVehicle(Vehicle vehicle) {
		
		vehicle.refuel();
		
	}
	
	
	
	private static void destroyVehicle(Vehicle vehicle) {

		vehicle.destroy();

	}
		
		
	
	
}
