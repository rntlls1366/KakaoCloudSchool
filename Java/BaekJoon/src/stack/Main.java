package stack;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new String[] {"SOOOL","XXXXO","OOOOO","OXXXX","OOOOE"}));
    }
}

class Next {
    static int[][] stage_check;
    int x;
    int y;
    int count;

    public Next() { }

    public Next(int x, int y, int count) {
        this.x = x;
        this.y = y;
        this.count = count;
    }
}

class Solution {
    static int x_max;
    static int y_max;
    public int solution(String[] maps) {
        int answer = 0;
        Queue<Next> q = new LinkedList<>(); //큐에 다음 갈 위치를 담을것임
        x_max = maps[0].length();   //무대의 열의 길이
        y_max = maps.length;    //무대의 행의 길이

        Next.stage_check = new int[x_max][y_max];
        //해당 좌표에 도달하는데 최소 몇 번의 움직임인지 기록한 static 변수
        Next start = new Next();
        Loop1 :
        for(int i = 0; i < x_max; i++) {
            Loop2 :
            for(int j = 0; j < y_max; j++) {
                if(maps[i].charAt(j) == 'S') {
                    start.x = i;
                    start.y = j;
                    start.count = 0;
                    break Loop1;
                }
            }
        }
        q.add(start);
        //S인 시작지점을 객체에 담고 q에 담음
        Next lever = new Next();
        while(true) {
            Next next = q.poll();
            if(Next.stage_check[next.x][next.y] > next.count) Next.stage_check = next.count;

            if(maps[next.x].charAt(next.y) == 'L') {
                lever.x = next.x;
                lever.y = next.y;
                lever.count = next.count;
                break;
            }

            if(rangeCheck(next, 1)) q.add(new Next(next.x - 1, next.y, next.count + 1));
            if(rangeCheck(next, 2)) q.add(new Next(next.x + 1, next.y, next.count + 1));
            if(rangeCheck(next, 3)) q.add(new Next(next.x, next.y - 1, next.count + 1));
            if(rangeCheck(next, 4)) q.add(new Next(next.x, next.y + 1, next.count + 1));
        }


        return answer;
    }

    public boolean rangeCheck(Next next, int direction) {
        //direction은 방향, 상하좌우 -> 1234
        switch(direction) {
            case 1 :
                if(next.x - 1 < 0) return false;
                break;
            case 2 :
                if(next.x + 1 >= x_max) return false;
                break;
            case 3 :
                if(next.y - 1 < 0) return false;
                break;
            case 4 :
                if(next.y + 1 >= y_max) return false;
                break;
        }
        return true;
    }
}
