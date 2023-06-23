import java.io.*;

public class Reader extends Thread {

    InputStream in;

    Reader(InputStream in) {
        this.in = in;
    }

    public void run() {
        try {
            InputStreamReader reader = new InputStreamReader(in, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Client Receiving!");
                System.out.println(line);
            }
            System.out.println("closed----");
            System.out.flush(); //버퍼에 남은 내용 흘리기
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                System.out.println("InputStream is closed...");
                this.in.close();
            } catch (IOException ignored) {
            }
        }
    }
}

