package day02;

import java.time.chrono.MinguoChronology;

// int radius ; // 원반지름 
// int w, h ; // 사각형 폭, 높이 
// 원그림(){ }
// 원면적구하기(){} 
// 사각형(){ }
// 사각형면적구하기(){}

// Emp 라는 클래스. 데이터 타입.
/*
자바 메모리 영역 
 1. Method Area : static 변수 .. class 정보.. 
 2. Heap : 객체(instance변수) 
 3. Stack  : 지역변수..
 자바의정석 ppt (ch6_2 객체지향개념1 9p~15p, 25p~39p 꼭 보세요)
 */ 
class Emp {
    int empno;   // instance변수
    String name; // instance변수
    String dept; // instance변수
    static int cnt ; // 사원수 static변수
}
public class Ex05ClassEx1 {
   public static void main(String[] args) {
      Emp one =  new Emp() ; one.empno=1;one.name="홍길동";
      Emp two =  new Emp() ; two.empno=2;two.name="김영희";
      // one, two 지역변수, reference type

      one.cnt = 2; two.cnt = 3;   // 권장하지 않음.(cnt 가 static 변수이므로) 
      Emp.cnt = 2; // 클래스이름.static 변수 <- 권장
      System.out.println(one.cnt); 
      // 3  (static 변수인 cnt를 Emp 클래스의객체들이 공유하므로)
   }
}
