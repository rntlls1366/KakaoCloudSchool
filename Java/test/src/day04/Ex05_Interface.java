package day04;
/* 인터페이스  */ 
/*  (public 키워드를 생략해도 자동 public )
 *  public abstract 메소드들과 
 *  public static final ..  상수들로 구성 됨.
 * 다중 상속 가능. 
 * 명명 규칙 : 대문자로 시작, 명사 또는 형용사.
 */
interface Drawable{
    void draw();  // 자동으로 public abstract 
    public abstract void move(int x, int y) ; 
    int PLAIN_PEN = 1 ; //자동으로  public static final
    public static final int BOLD_PEN = 2 ; 
} 
//인터페이스가 인터페이스를 상속할 때 extends
interface Drawable3D extends Drawable{  } 
interface AA {} 
class BB {}
// interfact 상속할때는 implements 키워드 써야 함.
abstract class Shape extends BB implements Drawable, AA{  }  // ..
class Circle extends Shape {
   public void draw() {System.out.println( " 원 그림");}
   public void move (int i, int j) {}
}
public class Ex05_Interface { 
    void 그림판( Drawable d ){
        d.draw(); 
    }
    public static void main(String[] args) {
          Drawable d = new Circle(); 
          BB b = (BB) d; 

        //   T obj1 = new A(); 
        //   Z obj2 = (Z)obj1; 
        //   //인터페이스를 캐스팅 
        //   A obj3 = new A(); 
        //   Z obj4 = (Z)obj3; 
        //   //상속관계가 없는 클래스 객체를 캐스팅. 컴파일 오류

    }
}
interface T{ } 
class A implements T{}
class Z {}