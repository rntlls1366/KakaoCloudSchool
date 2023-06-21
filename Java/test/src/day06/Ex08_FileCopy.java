package day06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Java IO Stream 의 종류
   1.  byte단위 전송 : ~InputStream, ~OutputSteam
         (데이터 변환 없이 그대로 전송)
       문자 단위 전송 : ~Reader, ~Writer
         (문자 코드를 인식, 코드를 변환기능있음)
         Reader : destination(Java, unicode로 변환해서 읽음)
   2.  실제 IO 가능 스트림
       실제 IO x (필터 스트림 ) 예) BuffedReader

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
public class Ex08_FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fin
                = new FileInputStream("data/monja.jpg");
        byte[] buffer = new byte[1024];

        FileOutputStream fout =
             new FileOutputStream("data/mongjaCopy.jpg");

        int count = 0 ;
        while( count != -1 ) {
            count = fin.read(buffer); // 1024byte 씩 읽기.
               if (count != -1 ) {
                   fout.write(buffer,0,count ); // TODO   코드를 추가해서 파일을 복사하세요
               }
        }
        fin.close(); fout.close();
    }
}
