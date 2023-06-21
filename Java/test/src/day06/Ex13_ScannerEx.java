package day06;

import java.util.Scanner;

public class Ex13_ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);     //InputStream을 생성자의 매개인자로 받음
        System.out.println(">정수를 입력하세요");
        int data1 = scan.nextInt();  		    //한단어 읽고 자동 int 변환
                                                //개행 문자 남아 있음
        System.out.println(">실수를 입력하세요");
        double data2 = scan.nextDouble();  	     //한단어 읽고 자동 double 변환
                                                 //개행 문자 남아 있음
        System.out.println(">문자열을 입력하세요");
        scan.nextLine();   			             //기존에 남아 있는 개행 문자를 없애야 함.
        String data3= scan.nextLine();  		 //한 줄을 읽음(개행 문자까지 읽음)

        System.out.println(">입력한 정보는 다음과 같습니다.");
        System.out.println(data1+" " + data2+" " +data3);

    }
}
