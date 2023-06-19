package day04;
class A{
    int data = 10; //초기화 문장. (생성자보다 먼저 실행.)
    A() {
        this.data = 20 ; 
    }
}
class AA{
   AA() { System.out.println("AA()");}
   AA(int i) { System.out.println("AA(int i )");}
}
class BB extends AA{
   BB(){  //부모클래스의 무인자(기본)생성자를 자동 호출
    System.out.println("BB()"); 
   }
   BB(int i){  //부모클래스의 인자가 있는 생성자 호출 시
     super(i) ;  // super ( 인자.. ) ; //반드시 첫문장.
     System.out.println("BB(int i)"); 
   }
}
class CC {  
    CC(int i) {}
}
// class DD extends CC {  // 오류 이유 
// }
class DD extends CC {  // 자동 기본 생성자 생성됨
     DD(){
       super();  // 자동으로 부모 기본 생성자 호출 
     }    // 부모의 무인자(기본 생성자)가 없으므로 컴파일 오류
}


public class Ex03_Constructor_Inheritance {
    public static void main(String[] args) {
        BB bb = new BB();

        A obj = new A(); 
        System.out.println( obj.data); // 20 
    }
}
