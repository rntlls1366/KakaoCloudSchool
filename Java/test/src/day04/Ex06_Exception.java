package day04;
// 프로그래밍의 오류의 종류 
/*
 *  1. 컴파일 오류.  (문법 오류)  
 *  2. 실행 오류 ( 실행 시 발생되는 오류)
 *       예)  메모리 부족,   file not found ,  ... 
 *       1) 심각.. 2) 가벼운 실행오류 - Exception  
 *  3. 논리 오류 - 테스트 케이스.. 로 테스트 
 */

 /* 자바는 Exception 이 발생하면  
  *  Exception 객체 를 생성해서 넘겨줌  
        예외처리가 안되어 있으면 
            에러메세지 화면 출력하고, 수행중지 
        예외처리가 되어 있으면. 그 구문을 수행.

예외처리 방법 :  1) try  catch finally 
                 2) throws 
*/
public class Ex06_Exception {
     public static void main(String[] args) {
          int i = 0 ; 
          String str = null;
          try { 
             //  int result = 10 / i ;  
             // 0으로 나눌 수 없어서 ArithmeticException 
             str.substring(1); //
            // NullPointerException 
            }catch(Exception e) { 
            //Exception 클래스는 모든 자바 예외의 최상위클래스임
             System.out.println(e.getMessage());
         }
     }
}
