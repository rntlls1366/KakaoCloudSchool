package lab04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Service;

@Service("carTest")
public class CarTest {
	@Autowired
	private Driver driver;

	public void start() {
		driver.drive();
	}

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CarTest.class);
		CarTest carTest = context.getBean("carTest", CarTest.class);
		System.out.println("시작");
		System.out.println(carTest.driver.toString());
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
