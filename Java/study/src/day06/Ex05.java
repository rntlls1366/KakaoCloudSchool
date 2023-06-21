package day06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex05 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C:/Users/user/Desktop/KJY/KakaoCloudSchool/Java/study/data/data1.txt");
            int i = fin.read(); //1byte 씩 읽기
            byte[] buffer = new byte[1024]; //1024byte 씩 읽기
            int count = fin.read(buffer);
            /*읽은 데이터를 buffer에 담아옴
            리턴하는 것은 읽은 바이트 수.
            100byte 읽었으면 100 리턴.
            모두 읽었으면 -1을 리턴.
             */

            System.out.println(i);
            System.out.write(i);
        }
        catch(Exception ignored) {
            System.out.println(ignored);
        }




    }
}
