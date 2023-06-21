package day06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
Java IO Stream 의 종류
   1.  byte단위 전송 : ~InputStream, ~OutputSteam
         (데이터 변환 없이 그대로 전송)
       문자 단위 전송 : ~Reader, ~Writer
         (문자 코드를 인식, 코드를 변환기능있음)
         Reader : destination(Java, unicode로 변환해서 읽음)
   2.  실제 IO 가능 스트림
       실제 IO x (필터/보조 스트림 ) 예) BuffedReader

Stream 특징
  1)한방향 InputStream/Reader  destination:Java  source:다양..
        OutputStream/Writer destination: 다양  source:Java
  2)뒤로 이동 못함..
  3)순서대로  먼저 출발한 데이터가 먼저 도착.

 */
/*
   java.io.FileInputStream
      : byte단위 전송
      : source file   destination  java
 */
public class Ex05_FileInputStreamEx {
    public static void main(String[] args) throws IOException {
        FileInputStream fin
                = new FileInputStream("data/data1.txt");
       // int i = fin.read();//1byte씩 읽기. 읽은 데이터를 리턴
        byte[] buffer = new byte[1024];
        int count = 0 ;
        while( count != -1 ) {
            count = fin.read(buffer); // 1024byte 씩 읽기.
            // 읽은 데이터는 buffer에 담아 옴.
            // 리턴하는 것은? 읽은 바이트 수.
            //  예) 100byte만 읽었으면 100 리턴, 1024byte를 읽었으면 1024 리턴
            //  예) 모두 읽었음. 더이상 읽을 것이 없으면  -1을 리턴.
           if (count != -1 )
               System.out.write( buffer,0,count );
        }
        fin.close();
    }
}
