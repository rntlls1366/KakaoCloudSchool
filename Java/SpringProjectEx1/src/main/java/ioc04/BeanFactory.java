package ioc04;
public class BeanFactory {
   private static UserService3 instance = new UserService3();
   
   public UserService3 getInstance(){
	   System.out.println("Factory의 getInstance 메서드 호출");
	   return instance ;
   }
}