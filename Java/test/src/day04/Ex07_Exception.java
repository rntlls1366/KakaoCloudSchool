package day04; 
// catch 블락을 여러개 둘 수 있다.  

public class Ex07_Exception {
     public static void main(String[] args) {
          int i = 10 ; 
          String str = null;
          try { 
               int result = 10 / i ;  // 0으로 나눌 수 없어서 ArithmeticException 
               str.substring(1); // NullPointerException 
          }catch(ArithmeticException e) { 
                System.out.println("aaaaa");
                //ArithmeticException 이 발생 했을 때만 실행
          }catch(NullPointerException e) { 
             System.out.println("bbb");
                //NullPointerException 이 발생 했을 때만 실행
          }catch(Exception e){       
               // 그 외의 Exception 이 발생 했을 때 실행
          }finally{
               System.out.println("항상 실행");
          }
          System.out.println( "정상 종료");
     }
}
