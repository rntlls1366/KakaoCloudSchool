package day01;
/* 
 자바 특징 : 
 1. 객체지향언어
 2. 플랫폼 독립적 언어 
 플랫폼이란? hw + os.  
 os에따라 기계어가 다르다. 

 플랫폼 종속적 언어 예) C 
   Test.c -> 컴파일(번역) 
      --> Test.exe (특정플랫폼에서만 동작)
 
 JVM : 1. class loader  2. bytecode 검증기 3. JIT compiler     
 JRE = JVM +...자바실행환경 
 JDK = JRE+ 개발 유틸리티 
 
환경변수 :  SW시스템이 동작할때 필요한 정보를 외부 변수에서 얻음. 
시스템환경변수 : OS에 등록하는 환경변수 
  예) path : 실행파일이 있는 폴더 
  >javac.exe 
      path = c:/ProgramFiles/java/jdk.../bin  
  예)JAVA_HOME = c:/ProgramFiles/java/jdk.../ 
java1.0 1.1 1.2 (Java2) java2 1.3 1.4 1.5(Java5) java17  
J2EE, J2SE, J2ME (JVM이 3종류로 java2버전부터 )
JavaEE, JavaSE, JavaME 

자바 데이터 타입 두 종류 
   value type : 기본형만 (byte,short,int, long, float, double, char, boolean)
   reference type : 나머지 모두 
*/


public class Ex01 {

    public static void main(String[] args) { // 
        // float f = 3.1; 오류  // 실수는 무조건 double 형으로 생성; 
        float f = 3.1f;  

        byte b1 = 10; 
        byte b2 = 20; 
        //byte b3 = b1 + b2 ;  오류//(byte, short, char)정수는 연산 시 int 로 자동형변환 
        int b3 = b1 + b2 ; 
        
        char ch = 'a' ; //저장 공간 2byte, unicode 
        System.out.println( 0.1+ 1.6); //실수형이 약간 오차가 있음
    }
}
