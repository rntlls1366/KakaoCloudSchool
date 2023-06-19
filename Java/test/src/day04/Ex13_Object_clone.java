package day04; 
//사용자가 클래스를 정의할 때 클래스 선언부에 Super 클래스가 없으면 extends Object를 자동으로 상속받게 됩니다. 
//다시말해, Object 클래스는 자바의 모든 클래스의 최상위 클래스 이며
//Object 클래스에서 상속받은 메서드와 변수를 모든 클래스에서 사용할 수 있습니다.

//< Object 클래스의 메소드 예  > 
//public String toString()  : 현재 객체의 문자열을 반환한다.
//public boolean equals(Object obj)  :  두 개의 객체가 같은지 비교하여 같으면 true를, 같지 않으면 false를 반환한다.
//protected  Object clone()	객체를 복사한다.
//protected  void finalize()	가비지 컬렉션 직전에 객체의 리소스를 정리할 때 호출한다.
//public Class getClass()	객체의 클래스형을 반환한다. 


 
//Object의 clone메소드는 객체를 복제하여 반환(Shallow Copy-참조하는 다른 객체는 복제 안함)
//주의점 : 1) clone메소드는 접근제한자는 protected이다. 
//       2) Cloneable interface 하위클래스의 객체만 복제 가능. 
//            Cloneable하위가 아닌 경우 복제 시도 시 예외 발생

//예) Object의 clone메소드 사용 예  
class Card implements Cloneable{
	int id ;   
	
	public Object clone() throws CloneNotSupportedException { 
	     return super.clone(); 
    }
}
public class Ex13_Object_clone {
   public static void main(String[] args) 
	 throws CloneNotSupportedException {
			 Card one = new Card (); 
			 one.id=432342; 
			 
			 // clone으로 복제한 것과.  = 로 복사한 것의 차이는?
			 Card two = (Card)one.clone();//one을 복제한 새 객체 생성
			 Card three = one; //주소복사. 즉, one과 three는 동일 객체 
			 
			 one.id=111111;
			 
	         System.out.println(two.id); 
	         System.out.println(three.id);
		}
	}

