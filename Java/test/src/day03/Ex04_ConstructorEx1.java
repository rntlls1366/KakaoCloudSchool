package day03;
/* 생성자  
생성자 : 객체 생성 시 자동 호출되는 특수한 메소드.
  객체 생성이 되자 마자 해야할 일 구현하면 됨.
생성자 작성 방법 
1) 클래스 이름과 같은 이름.  
2) 반환형 안씀. 
 */
class Emp{
    Emp() {  System.out.println("생성자"); } // 생성자  
    void Emp() { } // 메소드 
}
// 생성자가 없으면 자동으로 기본생성자가 생성됨
class Emp2{ }   // 아래와 같이 기본생성자 생김
// class Emp2{  Emp2() {}   }    
class Emp3{
    int id ;
    Emp3(int id) { //매개인자가 있는 생성자 
        this.id = id; // 생성자가 하나라도 있으면 
                    // 기본생성자가 자동으로 생기지 않음
    }
}
// 생성자 다중정의 overloading   
// 매개인자 갯수, 타입이 다르면 여러 생성자 작성 가능.
class Emp4{
    int id;
    Emp4() {  System.out.println("기본생성자");}
    Emp4(int id) { this.id = id; 
        System.out.println("Emp4(int id) ");
    } 
}
public class Ex04_ConstructorEx1 {
    public static void main(String[] args) {
        Emp4 a = new Emp4(); //Emp4()
        Emp4 b = new Emp4(10);  //Emp4(int id)
        Emp2 one = new Emp2(); // 기본(무인자)생성자 호출 
        Emp3 three1 = new Emp3(10);   System.out.println(three1.id);
    //  Emp3 three2 = new Emp3();  // 기본(무인자)생성자 호출하는데 기본 생성자가 없어서 오류. 
    // Emp3는 매개인자가 있는 생성자가 이미 있어서 기본생성자 자동 생성 안됨
    }
}
