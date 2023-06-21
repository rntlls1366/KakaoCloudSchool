package day06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
* BufferedReader 는 필터/보조 스트림 중에 하나이다.
*
* */
public class Ex10_FileReaderBufferedReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("data/data1.txt");
        BufferedReader br = new BufferedReader(fr );

        String line = "";
        while (line != null ) {
            line = br.readLine(); // 한 줄씩 읽기.
            if( line != null ) System.out.println( line );
            // 만약 다 읽어서, 더 이상 읽을 것이 없으면 null 리턴.
        }
        br.close(); fr.close();
    }
}
