package day08;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Ex07_NW_ClientTCP2 {
    public static void main(String[] args) throws IOException {
        Socket sock = new Socket("127.0.0.1", 10000);
        OutputStream out = sock.getOutputStream();

        //Scanner는 입력을 문자열로 바꾸어주는데, OutputStream은 Byte 그대로 보내면되니까 굳이 Scanner안써도됨
        byte[] buffer = new byte[1024];
        int count = 0;

        while((count = System.in.read(buffer)) != -1) {

            out.write(buffer, 0, count);  //아웃풋 스트림은 바이트단위 전송
        }


        out.close();



    }
}
