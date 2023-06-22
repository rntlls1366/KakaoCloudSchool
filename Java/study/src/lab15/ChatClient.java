package lab15;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) throws IOException {
        Socket sock = new Socket("127.0.0.1", 10000);
        InputStream in = sock.getInputStream();
        OutputStream out = sock.getOutputStream();

        ChatWrite write = new ChatWrite(out, "Client");
        ChatRead read = new ChatRead(in);

        write.start();
        read.start();



    }
}
