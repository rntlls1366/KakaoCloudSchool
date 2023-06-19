package day04;

abstract class Shape{
   abstract void draw() ; 
} 
// Circle은 abstract void draw() 받음 (super class Shape)
// Circle은 추상 메소드가 있는데, 추상클래스가 아니어서
// 컴파일 오류
// class Circle extends Shape {  
// }
// 1) 컴파일 오류 해결 방법 - 추상메소드(draw()) 구현
class Circle1 extends Shape {  
   void  draw() { }
}
// 2) 컴파일 오류 해결 방법 - 추상클래스로
abstract class Circle2 extends Shape {  
}
 
public class Ex02_Abstract {
    
}
