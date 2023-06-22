package day08;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EX12_FileTCPClient {
    public static void main(String[] args) throws Exception {

        Socket sock = new Socket("127.0.0.1", 10001);
        OutputStream out = sock.getOutputStream();
        FileInputStream fin = new FileInputStream("C:\\Users\\user\\Desktop\\KJY\\KakaoCloudSchool\\Java\\data\\client\\image.jpg");
// data/client폴더에 배경사진.jpg 파일이있어야 합니다.

        byte[] data = new byte[1024];
        int count = 0;
        while ((count = fin.read(data)) != -1) {
            out.write(data, 0, count);
        }
        out.close();
        sock.close();
    }
}