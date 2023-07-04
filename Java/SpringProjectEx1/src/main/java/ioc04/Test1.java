package ioc04;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

public class Test1 {
    public static void main(String[] args) {
        ApplicationContext factory = new
                ClassPathXmlApplicationContext("ioc04/test1.xml");
        UserService1 p = (UserService1)factory.getBean("userService1");
    }
}