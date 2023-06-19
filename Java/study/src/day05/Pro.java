package day05;
import java.util.*;
class Solution {


    public int solution(String name) {
        int answer = 0;
        int[] check = new int[name.length()];
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'A') check[i] = 1;
        }

        return go(name, check, 0, 1, 0);
    }

    public int go(String name, int[] check, int idx, int right, int cnt) {
        if (Collections.frequency(Arrays.asList(check), 1) == check.length) return cnt;
        if (check[idx] == 0) {
            cnt += upDown(name.charAt(idx));
            check[idx] = 1;
        }

        int temp = idx;

        if (right == 1) {
            if (temp + 1 >= name.length()) temp = 0;
            else temp++;

            if (check[temp] == 0) return go(name, check, temp, 1, cnt);
            else {
                int temp2 = temp - 1;
                if(temp2 == -1) temp2 = name.length() - 1;
                int l = go(name, check, temp2, 0, cnt);
                int i = idx;
                int cnt1 = 1;
                while (true) {
                    if (temp + 1 >= name.length()) temp = 0;
                    else temp++;
                    if (check[temp] == 0) break;
                    else cnt1++;
                }
                int r = go(name, check, temp, 1, cnt + cnt1);

                return l < r ? l : r;
            }
        } else {
            if (temp - 1 < 0) temp = name.length() - 1;
            else temp--;

            if (check[temp] == 0) return go(name, check, temp, 0, cnt);
            else {
                int temp2 = temp + 1;
                if(temp2 >= name.length()) temp2 = 0;
                int r = go(name, check, temp2, 1, cnt);
                int i = idx;
                int cnt1 = 1;
                while (true) {
                    if (temp - 1 < 0) temp = name.length() - 1;
                    else temp--;
                    if (check[temp] == 0) break;
                    else cnt1++;
                }
                int l = go(name, check, temp, 0, cnt + cnt1);

                return l < r ? l : r;
            }
        }

    }

    public int upDown(char c) {
        int num = (int) c;
        if (num > 78) {
            num = 91 - num;
        } else {
            num = num - 65;
        }
        return num;
    }


}

public class Pro {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("JEROEN"));
    }
}
