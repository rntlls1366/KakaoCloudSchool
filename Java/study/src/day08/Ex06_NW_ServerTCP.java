package day08;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex06_NW_ServerTCP {
    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(10000);
        Socket sock = s.accept();
        InputStream in = sock.getInputStream();

        int data = 0;
        while((data = in.read()) != -1) {
            System.out.write(data);
        }
        System.out.flush(); //버퍼에 남은 내용 흘리기
    }
}
