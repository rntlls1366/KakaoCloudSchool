package lab07;

import java.util.Scanner;

public class Lab08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열 입력");
        String st = scanner.next();

        for(int i = 0; i < st.length(); i++){
            if(st.charAt(i) >= 48 && st.charAt(i) <= 57) {
                System.out.print(st.charAt(i));
            }
        }
    }
}
