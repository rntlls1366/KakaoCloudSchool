package lab10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class 자료처리 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("study/src/lab10/source.txt");
        BufferedReader br = new BufferedReader(fr);

        String line = "";
        while (line != null) {
            line = br.readLine(); // 한 줄씩 읽기.
            if (line != null) {
                String[] st = new String[4];
                st = line.split(" ");
                int sum = 0;
                for(int i = 1; i < st.length; i++) {
                    sum += Integer.parseInt(st[i]);
                }
                System.out.println(st[0] + "의 평균 : " + (double)(sum/3));
            }
            // 만약 다 읽어서, 더 이상 읽을 것이 없으면 null 리턴.
        }
        br.close();
        fr.close();
    }
}
