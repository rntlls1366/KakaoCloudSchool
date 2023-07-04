package ioc02;

import ioc02.Player;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("player1.xml");
        Player p = (Player)factory.getBean("player"); // DL
        p.play();
    }
}