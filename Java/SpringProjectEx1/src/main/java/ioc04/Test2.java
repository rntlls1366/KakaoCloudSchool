package ioc04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

public class Test2 {
    public static void main(String[] args) {
        ApplicationContext factory = new
                ClassPathXmlApplicationContext("ioc04/test2.xml");
        UserService2 p = (UserService2)factory.getBean("userService2");
    }
}