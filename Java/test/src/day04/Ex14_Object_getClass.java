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



 

//<<  Class Class 객체 얻는 방법 >>  Class Class 란 Class 의 메타데이터 정보를 가지고 있 클래

//Class c1 = obj.getClass() 
//Class c2 =   팩키지명.클래스이름.class 
//Class c3 =   Class.forName(" 팩키지명.클래스이름")
 
public class Ex14_Object_getClass {
   public static void main(String[] args)  {
       //예) getClass()메소드 사용 예 
	

   }
}



