package day03;
class Car1{
    void run() { System.out.println(" 자동차 운전 ");  }
}
class Morning extends Car1{
    void run() { System.out.println(" Morning 운전 ");  }
}
class Genesis extends Car1{
    void run() { System.out.println(" Genesis 운전 ");  }
}
public class Ex11_Polymorphism_Upcasting{
    // 정적 바인딩 : 컴파일 시 타입에 따라 바인딩.
    // 동적 바인딩 : 실행 시 실제 객체를 확인한 후 메소드 호출 
    static void drive(Car1 c) {
       c.run(); 
    }
    public static void main(String args[]){
        Morning m = new Morning();
        drive(m) ;
    }
}