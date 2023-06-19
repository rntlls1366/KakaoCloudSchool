package day02;
// 자바 메소드는 인스턴스 메소드와 static 메소드
class Robot{
    String name ; // 인스턴스 변수
    int energy; // 인스턴스 변수
    static int cnt ; //static변수 (총 로봇생산 갯수)
    void move() {  // 인스턴스 메소드
        System.out.println( cnt ); // static 변수 사용가능
        energy = energy - 1;
        System.out.println("로봇움직임. 에너지는"+energy);
    }
}
public class Ex06ClassExMethod {
    public static void main(String[] args) {
        Robot one = new Robot(); one.energy=10;
        Robot two = new Robot(); two.energy=20;
        one.move();   one.move(); //  8
        two.move();    // 19
    }
}
