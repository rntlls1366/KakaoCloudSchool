package day06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex09 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("study/data/data1.txt");

//        int ch = fr.read(); //한 문자만 읽기.
//        System.out.println((char)ch);

        char[] buffer = new char[1000];
        //fr.read(buffer);    //한번에 1000문자 읽기.
        int count = 0;
        count = fr.read(buffer);    //몇 문자를 읽었는지 리턴.
            //읽어온 문자는 unicode로 변환해서 읽어옴


        fr.close();
    }
}
