package com.oehm.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-web.xml");
			//Brand brand = context.getBean(Brand.class);
			//Model model = context.getBean(Model.class);
			Brand brand = context.getBean(Brand.class);
			System.out.println(brand);
			
			//System.out.println(model);
		//int count = context.getBeanDefinitionCount();
		//System.out.println("number of objects crested is -"+count);
		//Car car = context.getBean(Car.class);
		//car.driveCar();
		//String carName = car.getCarName();
		//System.out.println(carName);
	}
}
