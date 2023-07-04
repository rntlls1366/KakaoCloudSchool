package ioc04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

public class Test3 {
 public static void main(String[] args) {
    ApplicationContext factory = new 
            ClassPathXmlApplicationContext("ioc04/test3.xml");  
    UserService3 p = (UserService3)factory.getBean("userService3");
   } 
}