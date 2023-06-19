package day02;
/*
 자바의 변수의 종류 
    클래스(static) 변수 : 클래스 안( 메소드 밖)에서 static 변수 선언
    인스턴스 변수 : 클래스 안( 메소드 밖)에서 변수 선언
    지역 변수 :  메소드안에서 변수 선언 
 */

public class Ex04LocalVariable {
    int a ; // 인스턴스 변수. 자동 초기화
    static int b ; // static 변수. 자동 초기화

    static void m1(){ // local 변수는 반드시 초기화를 해야 한다. 
        int num1 =10 ; // local 변수는 자신을 감싸는 block 내에서 유효. 
        while( num1 < 11){
            int num2 = 10 ; // local 변수 
        }
        // System.out.println(num2); // 오류
    }
    public static void main(String[] args) {
        m1();
        // System.out.println( num1 ); //오류
    }
    static void m3(){
        int num = 10; 
        int i = 1; 
        while ( i < 10 ) {
            // int num = 1; // 오류가 나는 이유는? 
            i++; 
        }
    }
}
