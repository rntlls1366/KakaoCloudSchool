package day02;
class Card{
    String kind ;
    int number ;
    static int width = 100;
    static int height = 250;  
    
    void instanceMethod(){
       System.out.println( kind +" "+number);
       System.out.println( width +" "+height);
    }
    static void staticMethod(){// static 변수만 사용가능 
       //System.out.println( kind +" "+number);//오류
        System.out.println( width +" "+ height );
        Card c = new Card(); 
        c.kind = "king" ;// OK   다른 객체의 변수 
    }
    void m1() {
        instanceMethod(); 
        staticMethod();
    }
    static void m2() {
        // instanceMethod();  // 오류
        staticMethod();  // static Method 만 호출 가능. 
        Card c = new Card();
        c.instanceMethod(); // OK 
    }
}
public class Ex07ClassExStaticMethod {
     static int width = 500;
     static  void staticMethod() {  System.out.println( width );}
     public static void main(String[] args) {
          Card.width = 110; // 클래스이름.static변수 
          Card.staticMethod(); // 클래스이름.static메소드()

          System.out.println( width ); // 500
          staticMethod() ; //  500 
     }
}
