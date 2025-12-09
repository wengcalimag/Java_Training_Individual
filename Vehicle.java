package com.bpi.individual.m2exercise2;
/**
** This an abstract class with attributes
** - numberOfWheels
** - brand
** and methods
** - a concrete method destroy()
** - an abstract method startEngine()

*/
public abstract class Vehicle implements Refuelable {

	int numberOfWheels;
	String brand;

	void destroy() {
	}

	abstract void startEngine();

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
