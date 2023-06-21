package day07;

import java.util.LinkedList;
import  java.util.Queue;

/*
Queue의 특징
1. 먼저 들어간 자료가 먼저 나오는 구조 FIFO(First In FIrst Out) 구조
2. 큐는 한 쪽 끝은 프런트(front)로 정하여 삭제 연산만 수행함
3. 다른 한 쪽 끝은 리어(rear)로 정하여 삽입 연산만 수행함
4. 그래프의 넓이 우선 탐색(BFS)에서 사용
*/

public class Ex02_QueueEx {
    public static void main(String[] args) {
        Queue queue = new LinkedList ();
        queue.add(1);
        queue.add(2);
        queue.add(3);
       // 자바에서 queue에 값을 추가하고 싶다면 add(value) 또는 offer(value)

        System.out.println( queue.poll());       // queue에 첫번째 값을 반환하고 제거 비어있다면 null
        System.out.println( queue.poll());
        queue.remove();     // queue에 첫번째 값 제거
        queue.clear();      // queue 초기화

        System.out.println( queue.isEmpty() ) ;// 큐가 비어 있는지
    }
}
