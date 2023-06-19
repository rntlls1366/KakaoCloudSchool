package day03;
class 회원{ 
    void 신용조회() {   System.out.println("회원신용조회");  }
    void 회원검증() {    신용조회() ;   } // 인스턴스변수는 동적바인딩
}
class VIP회원 extends 회원{
    void 신용조회(){   System.out.println("VIP회원신용조회");  }
}
public class Ex12_DynamicBinding {
     public static void main(String[] args) {
        회원 obj1 = new VIP회원();   obj1.회원검증();  
        회원 obj2 = new 회원();   obj2.회원검증();  
     }
}
