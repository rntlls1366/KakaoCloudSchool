package day04;
/* Annotation 
 *   @.. 
 *  컴파일러와 실행환경이 보는 주석.
 * 
 */
class Car{
    void run() {}
}
class Sonata extends Car{
    @Override
    void Run() { System.out.println("Sonata");}
    //재정의가 아니므로 컴파일 오류
}
public class Ex01_Annotation {
    
}
