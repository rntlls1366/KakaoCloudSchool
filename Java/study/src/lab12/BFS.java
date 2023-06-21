package lab12;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static int[][] check = new int[7][7];
    static int[][] stage = new int[7][7];
    public static void main(String[] args) {
        stage = new int[][]{
                {0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {1, 1, 0, 1, 0, 1, 1},
                {1, 1, 0, 1, 0, 0, 0},
                {1, 0, 0, 0, 1, 0, 0},
                {1, 0, 1, 0, 0, 0, 0}
                };
        bfs();
        if(check[6][6] > 0) System.out.println(check[6][6]);
        else System.out.println(-1);
    }
    public static void bfs() {
        Queue<Point> q = new LinkedList<Point>();
        q.offer(new Point(0, 0, 0));

        while(!q.isEmpty()) {
            Point p = q.poll();
            int x = p.x;
            int y = p.y;
            int cnt = p.cnt;
            System.out.println("x is " + x + " y is " + y + " cnt is " + cnt);
            check[x][y] = cnt;

            //상
            if(x - 1 >= 0) {
                if(check[x-1][y] == 0 && stage[x-1][y] == 0) {
                    q.offer(new Point(x-1, y, cnt + 1));
                }
            }
            //하
            if(x + 1 <= 6) {
                if(check[x+1][y] == 0 && stage[x+1][y] == 0) {
                    q.offer(new Point(x+1, y, cnt + 1));
                }
            }
            //좌
            if(y - 1 >= 0) {
                if(check[x][y-1] == 0 && stage[x][y-1] == 0) {
                    q.offer(new Point(x, y-1, cnt + 1));
                }
            }
            //우
            if(y + 1 <= 6) {
                if(check[x][y+1] == 0 && stage[x][y+1] == 0) {
                    q.offer(new Point(x, y+1, cnt + 1));
                }
            }
        }
    }
}

class Point{
    int x;
    int y;
    int cnt;
    Point(int x, int y, int cnt) {
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}