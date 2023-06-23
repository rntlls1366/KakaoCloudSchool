import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

class Writer extends Thread {
    OutputStream out;
    String id;

    int count = 0;

    public Writer(OutputStream out, String id) {
        this.out = out;
        this.id = id;
    }

    public void run() {
        //------------------------
        Dimension dim = new Dimension(400, 100);

        JFrame frame = new JFrame(this.id);
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
