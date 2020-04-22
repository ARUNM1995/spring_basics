package com.oehm.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-web.xml");
		Car car = context.getBean(Car.class);
		//car.driveCar();
		String carName = car.getCarName();
		System.out.println(carName);
	}
}
