package day06;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

/*
FileReader FileWriter 는 텍스트파일 처리.
*/
public class Ex09_FileReaderEx {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("data/data1.txt");
//        int ch  = fr.read() ; // 한 문자만 읽기.
//        System.out.println(  (char)ch );
        System.out.println(  fr.getEncoding() );

        FileReader fr2   //since 11
             = new FileReader("data/data1.txt", Charset.forName("UTF8"));
        System.out.println(  fr2.getEncoding());

        char[] buffer = new char[1000];
        int count = 0 ;
        count = fr.read(buffer);  // 한번에 1000문자씩 읽어옴.
                   //몇 문자를 읽었는 지 리턴.
                   //읽어온 문자는 unicode로 변환해서 읽어모.
        fr.close();
    }
}
