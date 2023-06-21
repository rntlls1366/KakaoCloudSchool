package day03;
// 추상 클래스 : 객체 생성이 안됨(추상메소드가 없어도 됨)
abstract class Emp22{
    void m() {  } //일반 메소드 
    // 추상메소드. (를 가지고 있는 클래스는 반드시 추상클래스)
    abstract double getSalary() ; 
 }
class Permanent22 extends Emp22{
    int year; String dept; 
    double getSalary() { return 1000; }
}
class SaleMan extends Permanent22{
    double getSalary() { return 1000; }
}

public class Ex14_Abstract {
    public static void main(String[] args) {
        // Emp obj = new Emp(); //추상클래스 객체 생성 못함.
    }
}
