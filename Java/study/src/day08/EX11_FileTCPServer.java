package day08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class EX11_FileTCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(10001);
        System.out.println("접속을 기다립니다.");
        Socket sock = server.accept();

        InputStream in = sock.getInputStream();
        FileOutputStream fout = new FileOutputStream("C:\\Users\\user\\Desktop\\KJY\\KakaoCloudSchool\\Java\\data\\server\\result.jpg");
        //data/server 폴더가 있어야 합니다.!!!

        byte[] data = new byte[1024];
        int count = 0;
        while ((count = in.read(data)) != -1) {
            fout.write(data, 0, count);
        }
        in.close();
        sock.close();
    }

}