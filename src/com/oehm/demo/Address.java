package com.oehm.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	@Value(value = "102")
	private String doorNumber;
	@Value(value = "karolbagh")
	private String addressLine1;
	@Value(value = "delhi")
	private String city;
	@Value(value = "India")
	private String country;
	
	public Address() {
		System.out.println(this.getClass().getSimpleName() +" created");
	}
	
	
	public String getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [doorNumber=" + doorNumber + ", addressLine1=" + addressLine1 + ", city=" + city + ", country="
				+ country + "]";
	}
	
	
	
	
	
}
