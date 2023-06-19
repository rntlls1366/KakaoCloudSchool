package day02;
public class Ex01 {
     public static void main(String[] args) {
        // for(int i=0;  ; i++){ //조건문 비우면? 무한루프
        // }
        outer: for(int i=0 ; i<10 ;i++){
            for(int j=0 ; j<10 ;j++){
                if (j==1) {
                    break outer; 
                }
            }
        }
     }
}
