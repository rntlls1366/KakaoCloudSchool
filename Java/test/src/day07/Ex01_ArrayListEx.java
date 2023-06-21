package day07;

import java.util.ArrayList;
/*
ArrayList
  배열보다 편리한 점
   1. 배열은 크기 고정.   Emp[] e = new Emp[4];
    가변 크기
   2. 편리한 메소드 제공..
 */
public class Ex01_ArrayListEx {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();  //Vector arr = new Vector();
        arr.add(2);   //add(new Integer(2)); 와 동일
        arr.add("test");
        for(int i=0 ; i < arr.size() ; i++){
            System.out.println(arr.get(i));
        }
    }
}
