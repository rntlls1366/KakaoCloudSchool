import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;

public class ServerReader extends Thread {

    InputStream in;
    Socket sock;
    String id;

    ServerReader(Socket sock, String id) throws IOException {
        this.sock = sock;
        this.in = sock.getInputStream();
        this.id = id;
    }

    ServerReader(InputStream in, String id) {
        this.in = in;
        this.id = id;
    }

    public synchronized void run() {
        try {

            InputStreamReader reader = new InputStreamReader(in, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            String[] check;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("\nReceived : " + line);
                check = line.split(" ");
                Message message = new Message();
                message.senderId = id;
                if(check[0].charAt(0) == '/' && check.length > 1) {
                    message.recieverId = check[0].substring(1, check[0].length());
                    message.content = check[1];
                }
                else {
                    message.recieverId = "ALL";
                    message.content = check[0];
                }

                Controller.addMessage(message);

            }

            System.out.flush(); //버퍼에 남은 내용 흘리기
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                this.in.close();
            } catch (IOException ignored) {
            }
        }
    }
}

