package lab15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class ChatRead extends Thread {

    InputStream in;

    ChatRead(InputStream in) {
        this.in = in;
    }

    public void run() {
        try {
            InputStreamReader reader = new InputStreamReader(in, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
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

class ChatWrite extends Thread {
    OutputStream out;
    String name;

    int count = 0;

    public ChatWrite(OutputStream out, String name) {
        this.out = out;
        this.name = name;
    }

    public void run() {
        //------------------------
        Dimension dim = new Dimension(400, 100);

        JFrame frame = new JFrame(this.name);
        frame.setLocation(200, 400);
        frame.setPreferredSize(dim);

        JTextField textField = new JTextField();

        JLabel label = new JLabel("입력");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);

        JButton button = new JButton("전송");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = textField.getText().concat("\n");
                byte[] buffer = new byte[0];
                try {
                    buffer = message.getBytes("UTF-8");
                } catch (UnsupportedEncodingException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    out.write(buffer, 0, buffer.length);
                    textField.setText("");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });

        frame.add(textField, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);

    }
}

public class ChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(10000);

        Socket sock = s.accept();
        InputStream in = sock.getInputStream();
        OutputStream out = sock.getOutputStream();

        ChatRead read = new ChatRead(in);
        ChatWrite write = new ChatWrite(out, "Server");



        read.start();
        write.start();

    }
}
