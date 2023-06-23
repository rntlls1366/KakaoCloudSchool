import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

class User {
    String id;
    int pw;
    String name;

    User(String id, int pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
    }
}

class Message {
    String senderId;
    String recieverId;
    String content;
}


public class Server {
    public static void main(String[] args) throws IOException {
        HashMap<String, User> userMap = new HashMap<>();
        userMap.put("aaa", new User("aaa", 1234, "김준연"));
        userMap.put("bbb", new User("bbb", 1234, "초콜릿"));
        userMap.put("ccc", new User("ccc", 1234, "라떼"));
        userMap.put("ddd", new User("ddd", 1234, "초코파이"));

        ServerSocket s = new ServerSocket(1010);
        Controller controller = new Controller();
        controller.start();

        while(true) {
            Socket sock = s.accept();
            Login login = new Login(sock, userMap);
            login.start();
            //로그인 쓰레드를 구동시키고, 여기서 로그인 절차가 성공한다면? 해당 소켓에 대한 ServerReader쓰레드가 하나 돌아가고
            //Controller의 sockMap static 변수에 값이 추가됨. 여기 들어있으면 로그인 중이란 거임.
        }
    }
}
