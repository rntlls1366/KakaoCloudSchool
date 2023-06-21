package day06;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07_FileOutputStreamEx {
    public static void main(String[] args) throws IOException {

//       FileOutputStream fout
//                = new FileOutputStream("data/out.txt");
        // data/out.txt 파일을 생성합니다.
        // 기존에 data/out.txt 파일이 있는 경우, 항상 새로 생성.

        FileOutputStream fout
           = new FileOutputStream("data/out.txt",true);
        // 기존에 data/out.txt 파일이 있는 경우, 그 파일 끝에 추가.

        fout.write(97);
        fout.close();
    }
}
