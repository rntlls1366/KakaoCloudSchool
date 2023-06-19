package lab07;

import java.util.Scanner;

public class Lab09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열 입력");
        String st = scanner.next();
        System.out.println("문자 입력");
        char c = scanner.next().charAt(0);

        int[] target = new int[st.length()];
        int targetIdx = 0;
        for(int i = 0 ; i < st.length(); i++) {
            if(st.charAt(i) == c) target[i] = 1;
        }

        for(int i = 0; i < st.length(); i++) {
            System.out.print(findTarget(target, i) + " ");
        }


    }

    public static int findTarget(int[] target, int idx) {
        int temp = idx;
        int down = 101, up = 101;
        int cnt = 0;
        while(temp >= 0) {
            if(target[temp] == 1) {
                down = cnt;
                break;
            }
            else {
                cnt++;
                temp--;
            }
        }
        cnt = 0;
        temp = idx;
        while(temp < target.length) {
            if(target[temp] == 1) {
                up = cnt;
                break;
            }
            else {
                cnt++;
                temp++;
            }
        }
        return Math.min(up, down);
    }
}
