package day03;
// 생성자에서 생성자를 호출 시에는 
// this() 호출. 반드시 생성자의 첫문장. 
class Emp5{
    static int cnt; // 총 사원 수 
    Emp5() {
        cnt = cnt + 1; 
        System.out.println("Emp()");
    }
    Emp5(int i) {
        this();  //무인자 생성자를 호출 
        System.out.println("Emp(int i)");
        // this();  // 첫문장이 아니면 오류.
    }
    Emp5(int i, int j) {
        this(10) ; // 매개인자 타입이 동일한 생성자 호출
        System.out.println("Emp(int i, int j)");
    }
}

public class Ex05_ConstructorEx2 {
    public static void main(String[] args) {
         Emp5 one = new Emp5();
         System.out.println(Emp5.cnt);
    }
}
