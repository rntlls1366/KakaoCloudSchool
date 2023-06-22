package day08;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex09_NW_Client_UDP {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress serverIP = InetAddress.getByName("127.0.0.1");
        int serverPort = 10000;
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length,serverIP, serverPort);

        DatagramSocket sock = null;
        int count = 0;
        try {
            sock = new DatagramSocket();
            while((count = System.in.read(buf)) != -1) {
                packet.setLength(count);    //몇바이트까지가 유효한지
                sock.send(packet);
            }

        }
        catch (IOException e) {}
        finally {
            sock.close();
        }
    }
}
