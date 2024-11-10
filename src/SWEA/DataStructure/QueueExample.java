package SWEA.DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        while (!queue.isEmpty()) {
            System.out.println("현재 큐의 가장 앞에 있는 원소 : " + queue.peek());
            queue.poll();
        }
    }
}
