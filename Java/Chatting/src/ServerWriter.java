import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

class ServerWriter extends Thread {
    OutputStream out;
    String id;

    int count = 0;

    public ServerWriter(OutputStream out, String id) {
        this.out = out;
        this.id = id;
    }

    public void run() {


    }
}
