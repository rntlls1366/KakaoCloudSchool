package lab12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Lab14 {
    public static void main(String[] args) throws IOException {

        //파일 객체 생성
        File file = new File("C:\\Users\\user\\Desktop\\KJY\\KakaoCloudSchool\\Java\\study\\src\\lab12\\src.txt");
        RandomAccessFile raf=new RandomAccessFile("C:\\Users\\user\\Desktop\\KJY\\KakaoCloudSchool\\Java\\study\\src\\lab12\\result.txt","rw");
        //스캐너로 파일 읽기
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()) {

            String s = scan.nextLine();
            s = s.replaceAll("무인기", "드론");
            System.out.println(s);
            raf.writeUTF(s);

        }

    }
}
