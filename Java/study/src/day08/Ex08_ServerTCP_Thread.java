package day08;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class TCPServerThread extends Thread {
    Socket sock;
    OutputStream out;
    InputStream in;

    TCPServerThread(Socket sock) {
        this.sock = sock;
    }

    public void run() {
        try {
            this.out = sock.getOutputStream();
            this.in = sock.getInputStream();

            int data = 0;
            while ((data = in.read()) != -1) {
                System.out.write(data);
            }
            System.out.flush(); //버퍼에 남은 내용 흘리기
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                this.out.close();
                this.in.close();
            } catch (IOException ignored) {
            }
        }
    }
}

public class Ex08_ServerTCP_Thread {
    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(10000);

        while (true) {
            Socket sock = s.accept();
            TCPServerThread t = new TCPServerThread(sock);
            t.start();
        }
        //Socket sock = s.accept();
//        InputStream in = sock.getInputStream();
//
//        int data = 0;
//        while((data = in.read()) != -1) {
//            System.out.write(data);
//        }
//        System.out.flush(); //버퍼에 남은 내용 흘리기
    }
}
