package day08;

import java.util.Scanner;

public class Ex02_ThreadJoin implements Runnable{

    static String name;
    @Override
    public void run() {
        System.out.println("이름을 입력하세요");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
    }

    public static void main(String[] args){
        Thread t = new Thread(new Ex02_ThreadJoin());
        t.start();
//        try {
//            t.join();
//        }
//        catch (InterruptedException e) {}

        System.out.println(name);
    }
}
