package day05;


// so  Tab 키 (intellj 단축키)

// sout   souf  soutv  (intellj 단축키)

public class Ex10_printf {
    public static void main(String[] args) {
        System.out.print("newline문자없음 ");
        System.out.print("newline문자없음 ");
        System.out.println("마지막문자 newline문자");
        System.out.println("마지막문자 newline문자");

        //printf  출력 형식 지정가능 , 마지막문자에 newline문자없음

        // \n  newline 문자
        System.out.printf("%.2f \n" , 10.0/3); //소수점아래 2자리수
        System.out.printf("%.4f \n" , 10.0/3); //소수점아래 4자리수
        System.out.printf("%7.4f \n", 10.0/3); //총7자리 소수점아래 4자리수
        System.out.printf("%e \n", 10.0/3); //지수형식
        System.out.printf("%15e \n", 10.0/3); //총15자리 지수형식

        System.out.printf("%d \n", 10  ); //10진수
        System.out.printf("%10d \n", 10  ); //10진수  10자리
        System.out.printf("%X \n", 10 ); //16진수
        System.out.printf("%8s \n", 10 ); //문자열로 5자리
        System.out.printf("%8s \n", "hello"); //문자열로 5자리

        System.out.printf("name:%s age:%d year:%d \n", "홍길동", 14, 2017);

    }
}

