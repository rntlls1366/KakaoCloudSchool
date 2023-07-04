package ioc02;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04 {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("player2.xml");
        Player p = (Player)factory.getBean("player");
        p.play();
    }
}