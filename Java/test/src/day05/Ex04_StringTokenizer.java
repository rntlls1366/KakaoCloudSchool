package day05;

import java.util.StringTokenizer;

public class Ex04_StringTokenizer {
    public static void main(String[] args) {
        String str1 = "aaa:bbb:ccc";
        System.out.println("구분자로 단어 나누기");

        StringTokenizer str2 = new StringTokenizer(str1, ":");
    /* 생성자의 두번째 인자를 구분자 문자로 인식하여
       생성자의 첫번째 인자 문자열을 다음과 같이 단어별로 복사할 수 있다. */
        while (str2.hasMoreTokens()) {
            String a = str2.nextToken();
            System.out.println(a);
        }

        String str3 = "  aaa   bbb   ccc   ";
        System.out.println("구분자로 단어 나누기");
        StringTokenizer str4 = new StringTokenizer(str3);
        /* 생성자의 두번째 매개인자가 없는 경우 공백문자를 구분자 문자로 인식하여 생성자의 첫번째 인자 문자열을 다음과 같이 단어별로 복사할 수 있다. */
        while (str4.hasMoreTokens()) {
            String a = str4.nextToken();
            System.out.println(a);
        }
    }
}