package day07;

import java.util.Scanner;

public class Ex00_StandardIO {
    public static void main(String[] args) {
        System.out.print(" out ");
        System.err.print(" err ");
        Scanner scan = new Scanner(System.in) ;

        System.out.printf("이름입력하세요");
        String n = scan.nextLine();
        System.out.printf("n");
    }
}
