import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Controller extends Thread {
    static Queue<Message> Messages = new LinkedList<>();
    static HashMap<String, OutputStream> sockMap = new HashMap<>();

    Controller() {
    }

    ;

    public static void addSocket(String id, Socket sock) throws IOException {
        sockMap.put(id, sock.getOutputStream());
    }

    public static void addMessage(Message message) {
        Messages.add(message);
    }

    public synchronized void run() {
        while (true) {
            //synchronized (this) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (Messages.size() > 0) {
                System.out.println("Message Queue is Exist!");
                Message message = Messages.poll();
                if (message.content.equals("help")) {
                    System.out.println(sockMap.size());
                    System.out.println(Messages.size());
                }
                if (message.recieverId.equals("ALL")) {
                    Set<String> keySet = sockMap.keySet();
                    for (String key : keySet) {

                        if (!key.equals(message.senderId)) {

                            byte[] buffer;
                            try {
                                buffer = message.content.getBytes("UTF-8");
                            } catch (UnsupportedEncodingException ex) {
                                throw new RuntimeException(ex);
                            }
                            try {
                                System.out.println("Send Message to " + key + " Output is " + sockMap.get(key).toString());
                                System.out.println("Buffer.length is " + buffer.length);
                                System.out.write(buffer);
                                sockMap.get(key).write(buffer, 0, buffer.length);
                                //sockMap.get(key).write(buffer, 0, buffer.length);

                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                    }
                } else {
                    byte[] buffer;
                    try {
                        buffer = message.content.getBytes("UTF-8");
                    } catch (UnsupportedEncodingException ex) {
                        throw new RuntimeException(ex);
                    }
                    try {
                        System.out.println("Send Message One : Out check :  " + sockMap.get(message.recieverId).toString());
                        System.out.write(buffer);
                        sockMap.get(message.recieverId).write(buffer, 0, 1024);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
            //}
        }
    }
}