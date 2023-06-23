import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

public class Login extends Thread{
    Socket sock;
    HashMap<String, User> userMap;
    InputStream in;
    OutputStream out;

    Login(Socket sock, HashMap<String, User> userMap) throws IOException {
        this.sock = sock;
        this.userMap = userMap;
        this.in = sock.getInputStream();
        this.out = sock.getOutputStream();
    }
    public void run() {
        try {
            String loginMessage = "아이디와 비밀번호를 입력하세요. (공백으로 구분)";
            String message = loginMessage.concat("\n");
            byte[] buffer = new byte[0];
            try {
                buffer = message.getBytes("UTF-8");
            } catch (UnsupportedEncodingException ex) {
                throw new RuntimeException(ex);
            }
            try {
                out.write(buffer, 0, buffer.length);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            InputStreamReader reader = new InputStreamReader(in, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                String[] check = line.split(" ");
                if(userMap.containsKey(check[0])) {
                    if(Integer.parseInt(check[1]) == userMap.get(check[0]).pw) {
                        System.out.println("Login success! user id : " + check[0]);

                        Controller.addSocket(check[0], sock);

                        ServerReader serverReader = new ServerReader(sock, check[0]);
                        serverReader.start();

                        message = "로그인 하였습니다.";
                        message = message.concat("\n");
                        buffer = new byte[0];
                        try {
                            buffer = message.getBytes("UTF-8");
                        } catch (UnsupportedEncodingException ex) {
                            throw new RuntimeException(ex);
                        }
                        try {
                            System.out.println("Login OutStream check :  " + out.toString());
                            out.write(buffer, 0, buffer.length);
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                        return;
                    }
                    else {
                        System.out.println("Login Failed");
                        message = "비밀번호가 틀렸습니다.";
                        message = message.concat("\n");
                        buffer = new byte[0];
                        try {
                            buffer = message.getBytes("UTF-8");
                        } catch (UnsupportedEncodingException ex) {
                            throw new RuntimeException(ex);
                        }
                        try {
                            out.write(buffer, 0, buffer.length);
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                } else {
                    System.out.println("Login Failed");
                    message = "존재하지 않는 아이디입니다.";
                    message = message.concat("\n");
                    buffer = new byte[0];
                    try {
                        buffer = message.getBytes("UTF-8");
                    } catch (UnsupportedEncodingException ex) {
                        throw new RuntimeException(ex);
                    }
                    try {
                        out.write(buffer, 0, buffer.length);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }

            System.out.flush(); //버퍼에 남은 내용 흘리기
        }
        catch (IOException e) {
        }

    }
}
