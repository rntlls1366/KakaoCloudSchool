package ioc04;

// UserService2 는 반드시 singleton 
public class UserService2 {
	private static UserService2 instance = new UserService2 ();

	private UserService2() {
		System.out.println("UserService 생성자 호출");
	}

	public static UserService2 getInstance() {
		System.out.println("getInstance 메서드 호출");
		return instance;
	}
} 