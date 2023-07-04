package com.mycom.biz.user;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.*;
import com.mycom.biz.user.vo.UserVO;
import org.springframework.stereotype.Controller;

public class UserServiceClient { 

   public static void main(String[] args) {
 
       ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
      
       UserService userService = (UserService)factory.getBean("userService"); 
       UserVO vo = new UserVO();  
       vo.setId("test");  
       vo.setPassword("test123");

       UserVO user = userService.getUser(vo); 
       if(user != null){  
             System.out.println(user.getName() + "님 로그인"); 
       }else{      
             System.out.println("로그인 실패");  } 
    } 
} 

// 실행결과 : 관리자님 로그인