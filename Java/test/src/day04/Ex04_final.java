package day04;
// final 
// 1) 메소드 선언문 앞에. 
//     하위 클래스에 재정의 방지. 
class Vehicle{
    final void print() { }
}
class AAA extends Vehicle{
    void print() {  } // 오류
}
// 2) 클래스 앞에 
//       상속 방지
final class Bus extends Vehicle{
}
class BBB extends Bus{  //오류 // final 클래스를 상속할 수 없다.
}
class Test extends String { } 
// final 클래스를 상속할 수 없다. String 클래스는 final class 이다.

// 3) 변수 선언 앞에  
public class Ex04_final { 
   final int DATA = 10;  // 상수. 값 재할당 금지.
   final int AA ;   //상수. 한번만 값을 할당할 수 있음
   Ex04_final(int a){
    this.AA = a;
   }
}
