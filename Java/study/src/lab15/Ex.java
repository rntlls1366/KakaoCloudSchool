package lab15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex {
    public static void main(String[] args) {
        Dimension dim = new Dimension(400, 100);

        JFrame frame = new JFrame("Chatting");
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
                //label.setText(textField.getText());
            }
        });

        frame.add(textField, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}
