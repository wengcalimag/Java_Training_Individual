package com.bpi.individual.m2exercise2;


/*
** This is a concrete class, it is a Vehicle and it is Refuelable
*/
public class Truck extends Vehicle{

	
	public Truck (int numWheels, String brand) {
		this.setNumberOfWheels(numWheels);
		this.setBrand(brand);
	}
	
	
	@Override
	public void refuel() {
		System.out.println("Refuelling " + this.getBrand() + " Truck...");
		
	}

	@Override
	void startEngine() {
		System.out.println("Starting Engine of " + this.getBrand() + " Truck with " + this.getNumberOfWheels() + " wheels...");
		
	}

	@Override
	void destroy() {
		System.out.println("Destroying " + this.getBrand() + " Truck..." );
			
	}


}
