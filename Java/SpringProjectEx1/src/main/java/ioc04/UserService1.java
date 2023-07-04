package ioc04;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserService1 {
	private static Logger logger = LogManager.getLogger();
	public UserService1(){
	     System.out.println("UserService 생성자 호출");
	}
	public void initMethod(){
	     System.out.println("UserService:initMethod Call.");
	}
	public void destroyMethod(){
	     System.out.println("UserService:destroyMethod Call");
	}
}