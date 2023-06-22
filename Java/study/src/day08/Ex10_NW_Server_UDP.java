package day08;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Ex10_NW_Server_UDP {
    public static void main(String[] args) throws IOException {

        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        DatagramSocket sock = new DatagramSocket(10000);

        while(true) {
            sock.receive(packet);
            System.out.println("클라이언트로부터 받은 데이터");
            System.out.write(packet.getData(), 0, packet.getLength());
            System.out.flush();
        }

    }
}
