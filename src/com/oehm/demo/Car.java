package com.oehm.demo;

public class Car {

	private String carName;
	
	public Car() {
			System.out.println(this.getClass().getSimpleName() +"created");
	}
	
	public void driveCar() {
		System.out.println("pritam is driving  " + carName  +" car");
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}
	
}
