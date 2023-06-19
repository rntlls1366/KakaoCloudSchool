package day03;
/* 메소드 Overloading 다중정의
 * 
 *  하나의 클래스에 같은 이름의 메소드가 
 *  여러개 있을 수 있다.  
 *  단, 매개인자 타입이나 갯수가 다르면
 */
class MethodOverLoadingEx{
    // static void add(int i, int j){ 
    // }
    //반환형만 다른 것은 안됨
    // static int add(int i, int j){ return 0 ;
    // }
    static void add(double i, double j){ 
        System.out.println(  "add(double) ");
    }
    static void add(short i, short j){
        System.out.println(  "add(short) ");
    }
    void connect(String id, String pw){
    }
    void connect(String endpoint, String id, String pw){
    }
    void connect(){ 
    }
}
public class Ex03_MethodOverloading {
     public static void main(String[] args) {
        MethodOverLoadingEx.add(10, 20) ;
        // add(int i, int j)
        // 위의 메소드가 없으면 묵시적형변환가능한 
        // 매개인자를 찾음 //add(double i, double j)
        byte b1 = 10; byte b2=20; 
        MethodOverLoadingEx.add(b1,b2) ; 
        // 묵시적 형변환이 가까운쪽 
     }
} // byte > short > int > long > float > double  
