package com.mycom.biz.lab04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("carTest")
public class CarTest {
	@Autowired
	private Driver driver;

	public void start() {
		driver.drive();
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CarTest carTest = context.getBean("carTest", CarTest.class);
		carTest.start();
	}
}

@Service("driver")
class Driver {
	@Autowired
	private Car mycar;

	public void drive() {
		mycar.run();
	}
}

interface Car {
	void run();
}

@Service("car")
class Sonata implements Car {
	public void run() {
		System.out.println("소나타가 달림");
	}
}

