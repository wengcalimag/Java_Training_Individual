package com.bpi.individual;

public class Car1 {

	String carBrand;
    String carType1;
	String carType2;

	//no-args Constructor
	public Car1 () {	
	}
	
	public Car1(String carBrand, String carType1, String carType2) {
      this.carBrand = carBrand;
      this.carType1 = carType1;
      this.carType2 = carType2;
	}
	
	public void displayCar () {
		System.out.println(this.carBrand + this.carType1 + this.carType2);

	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarType1() {
		return carType1;
	}

	public void setCarType1(String carType1) {
		this.carType1 = carType1;
	}

	public String getCarType2() {
		return carType2;
	}

	public void setCarType2(String carType2) {
		this.carType2 = carType2;
	}
	

}
