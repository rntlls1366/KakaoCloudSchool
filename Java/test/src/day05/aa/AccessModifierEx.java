package day05.aa;

public class AccessModifierEx {
  public static void main(String[] args)
    {
        Person1 one = new Person1();
        //one.data1 = 10 ;
        //private인 data1이 속해있는 클래스가 아니므로 컴파일 오류

        one.data2 = 10;
        //Test1은 Person1과 동일 팩키지에 있는 클래스이므로 OK
    }
}
