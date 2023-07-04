package ioc04;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

public class Test4 {
	private static Logger logger = LogManager.getLogger();
	public static void main(String[] args) {
		logger.info("log");
	  ApplicationContext factory = new 
             ClassPathXmlApplicationContext("ioc04/test4.xml");  
	  UserService4 p1 = 
             (UserService4)factory.getBean("userService4");
	  UserService4 p2 = 
             (UserService4)factory.getBean("userService4");
	  UserService4 p3 = 
             (UserService4)factory.getBean("userService4");
	}
}