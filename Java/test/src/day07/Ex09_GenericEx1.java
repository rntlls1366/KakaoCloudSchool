package day07;

class Test<T>{      //T 라는 데이터타입을 지금 결정하지 아니함. 객체를 선언할 때 명시하여 결정
    Object obj1;

    T obj2;

    void setObj2(T obj2) {
        this.obj2 = obj2;
    }
}

public class Ex09_GenericEx1 {
    public static void main(String[] args) {
        Test<String> test = new Test<>();
        test.setObj2("kjy");

    }

}
