package day04;

//예외처리 throws 구문 예)

public class Ex09_Exception_throws { 

    static void m1() throws Exception {//Exception타입의 예외 발생 시 
          m2();     //이 메소드를 호출한 쪽으로 예외 객체를 던짐 
    } 
    
    static void m2() throws Exception {//Exception타입의 예외 발생 시
        int i =0 ;  
        int r = 10/i  ;    //이 메소드를 호출한 쪽으로 예외 객체를 던짐
    }  
    public static void main(String[] args){
        try{  
            m1();  
        }catch(Exception e) {   
            System.out.println(" 예외발생 ") ;  
        } 
    }
 } 
