package day02;
//하나의 파일에 public class가 한개만 올수 있다.
//public class 이름과 파일이름이 다르면 오류.   같아야 함.
//public class 가 아니면 파일이름과 달라도 됨.
//하나의 파일에 class 를 여러개 가능. 

// 만약 아래와 같이 클래스가 있으면 
// 컴파일 시    .class 파일은 어떻게 생기는가?
//    bin/팩키지명/Ex02FileName.class   AA.class

public class Ex02FileName { 
    public static void main(String[] args) {
        System.out.println("Ex02FileName");
    }
}
class AA{
    public static void main(String[] args) {
        System.out.println("AA");
    }
}
