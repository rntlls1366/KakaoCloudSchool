package day03;
 
class Animal2{
  int id = 10; 
  void m() { System.out.println("Animal의 메소드");}
}
class Lion22 extends Animal2{ // Lion is a Animal
   int id = 20;  
   void test() {
       super.m(); // super class의 m() 호출 됨.
       m()  ; // 재정의된 m();  
   }
   //Method overriding 재정의. 
   //메소드이름,매개인자타입,반환타입까지 같아야함.
   void m() { System.out.println("Lion 메소드");  }
   //Mehtod Overloading 다중정의
   void m(int i) { System.out.println("Lion 메소드");}
}
public class Ex09_Overriding {
    public static void main(String[] args) {
        Lion one = new Lion() ; one.m(); 
        // 재정의된 메소드 호출됨.
    }
}
