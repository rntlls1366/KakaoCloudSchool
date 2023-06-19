package day05;

public class Ex05_InitalizationBlock {
    public static void main(String[] args) {
        Test one1 = new Test();
        Test one2 = new Test();
    }
}
class Test{
    int[] data1 = new int[100] ;        //초기화 문장
    static int[] data2 = new int[100];         //초기화 문장

    {   //객체가 생성될 때 마다 실행  //초기화 블락
        for(int i = 0 ; i<100 ; i++){
            data1[i] = i+1;
        }
        System.out.println("초기화 블락 실행 ") ;
    }

    static{ //클래스가 메모리에 로드 될 때 // static 초기화 블락
        for(int i = 0 ; i<100 ; i++){
            data2[i] = i+1;
        }
        System.out.println("static 초기화 블락  실행 ") ;
    }
}
//    초기화 문장과 초기화 블락은 생성자보다 먼저 실행된다.

