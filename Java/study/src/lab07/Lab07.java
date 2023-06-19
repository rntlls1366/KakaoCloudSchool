package lab07;
import java.util.Scanner;

public class Lab07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열 입력");
        String st = scanner.next();

        String answer = "";

        int cnt = 1;
        for(int i = 0; i < st.length() - 1; i++) {
            if(st.charAt(i) == st.charAt(i+1)) cnt++;
            else {
                if(cnt > 1) {
                    answer = answer.concat(String.valueOf(st.charAt(i)) + cnt);
                }
                else answer = answer.concat(String.valueOf(st.charAt(i)));
                cnt = 1;
            }
        }
        if(cnt > 1) {
            answer = answer.concat(String.valueOf(st.charAt(st.length()-1)) + cnt);
        }
        else if(cnt == 1) {
            answer = answer.concat(String.valueOf(st.charAt(st.length()-1)));

        }

        System.out.println(answer);
    }
}
