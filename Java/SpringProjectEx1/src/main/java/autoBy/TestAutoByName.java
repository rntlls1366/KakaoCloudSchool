package autoBy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

public class TestAutoByName {
	public static void main(String[] args) { 
		ApplicationContext factory = new 
       ClassPathXmlApplicationContext("autoBy/autoByName.xml");
		Driver p = (Driver)factory.getBean("driver");
		p.d.run(); 
	}  
}

class Driver{
	public Car d = null;
	public void setCar(Car d){// 속성명  car.   car라는 이름의 bea
		this.d = d;
	} // 속성명  car. car라는 이름의 bean을 autowire="byName"
}
interface Car{ 
	public void run();
} 
class Sonata  implements Car{
	public void run() {
		System.out.println("Sonata run");
	}
}

class Genesis implements Car{
	public void run() {
		System.out.println("Genisis run");
	}
}