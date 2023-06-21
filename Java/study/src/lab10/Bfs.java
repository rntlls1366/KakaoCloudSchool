package lab10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Bfs {
    public static void main(String[] args) {
        ArrayList[] arr = new ArrayList[8];
        for (int i = 0; i < 8; i++) arr[i] = new ArrayList<>();

        int[] c = new int[8];
        // 1과 2 연결
        arr[1].add(2);
        arr[2].add(1);
        // 1과 3 연결
        arr[1].add(3);
        arr[3].add(1);
        // 2와 3연결
        arr[2].add(3);
        arr[3].add(2);
        // 2와 4연결
        arr[2].add(4);
        arr[4].add(2);
        // 2와 5연결
        arr[2].add(5);
        arr[5].add(2);
        // 3와 6연결
        arr[3].add(6);
        arr[6].add(3);
        // 3와 7연결
        arr[3].add(7);
        arr[7].add(3);
        // 4와 5연결
        arr[4].add(5);
        arr[5].add(4);
        // 6와 7연결
        arr[6].add(7);
        arr[7].add(6);

        bfs(1, arr, c);

    }

    public static void bfs(int start, ArrayList[] arr, int[] c) {

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        c[start] = 1;
        while (!q.isEmpty()) {
            int x = q.poll();
            System.out.println(x);
            for (int i = 0; i < arr[x].size(); i++) {
                int y = (int) arr[x].get(i);
                if (c[y] == 0) {
                    q.add(y);
                    c[y] = 1;
                }
            }
        }
    }
}
