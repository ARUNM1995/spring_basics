package com.oehm.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(scopeName = "singleton")
@Component
public class BookTicket {

	@Value(value = "Lokesh")
	private String name;
	
	
	
	public BookTicket() {
			System.out.println(this.getClass().getSimpleName() +" created");
	}
	
	@PostConstruct
	public void bookTicket(){
		System.out.println("Ticket is booked to goa by " +name);
	}


	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}
