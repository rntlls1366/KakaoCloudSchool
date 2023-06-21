package day06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex08 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("./study/data/data1.txt");
        byte[] buffer = new byte[1024];
        FileOutputStream fout = new FileOutputStream("./study/data/data1Copy.txt");
        //새파일생성
        FileOutputStream fout2 = new FileOutputStream("./study/data/data1.txt", true);
        //기존 파일에 append 가능 인자 true
        int count = 0;
        while(count != -1) {
            count = fin.read(buffer);
            if(count != -1) {
                fout.write(buffer, 0, count);
            }
        }
        fin.close();
        fout.close();
    }
}
