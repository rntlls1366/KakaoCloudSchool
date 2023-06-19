package day03;
//은닉과 재정의 
/*
 */
class Animal{
  int id = 10; 
  }
class Lion extends Animal{ // Lion is a Animal
   int id = 20; // super class에서 정의한 변수와
                // 같은 이름으로 정의하면 
                // 상속받은 변수는 은닉.
   void print(){
      System.out.println(id);  
      System.out.println(super.id);  // 은닉된 변수값을 가져옴.
   } 
}
public class Ex08_Hiding {
    public static void main(String[] args) {
        Lion one = new Lion() ; one.print(); 
    }
}
