import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client3 {
    public static void main(String[] args) throws IOException {
        Socket sock = new Socket("127.0.0.1", 1010);
        InputStream in = sock.getInputStream();
        OutputStream out = sock.getOutputStream();

        Writer writer = new Writer(out, "Client3");
        Reader reader = new Reader(in);

        writer.start();
        reader.start();
    }
}
