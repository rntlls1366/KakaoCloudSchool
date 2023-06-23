package day09;

interface MyFunction {  //함수형 인터페이스 : 추상 메소드가 하나만 있는 인터페이스
    public abstract int max(int a, int b);
}

public class Ex_Lambda {
    public static void main(String[] args) {

        MyFunction f = (a, b) -> a > b ? a : b;
        System.out.println(f.max(1, 2));

        Runnable r = () -> {
            System.out.println("aa");
        };
    }
}
