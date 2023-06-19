package day02; 

// 프로그램의 시작점에 해당되는 main은 
//    반드시  public static  void main(String[] args)

public class Ex03Method {
    public static  void main(String[] args) {
        System.out.println("test"); 
        // int a = m1(); // 반환형이 void .. 오류
        double d = m2(); 
        int result = sum(1,2);
    }

    // 자바 메소드 선언문에서 반환타입을 정의해야함. 
    // 반환 데이터가 없는 경우는 void 반환형 
    static void m1() {
        System.out.println("리턴 없음");
    }

    // 자바 메소드 선언문에서 반환데이터타입을 반드시 정의
    static double m2() { 
         return 1.0; 
    }
    
    //매개인자 데이터타입도 정확히 명시
    static int sum(int a, int b ) { 
       return a + b;
    }


}
