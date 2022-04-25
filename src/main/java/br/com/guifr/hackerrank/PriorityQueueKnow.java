package br.com.guifr.hackerrank;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueKnow {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        PriorityQueue<Integer> queueReversing = new PriorityQueue<>(Collections.reverseOrder());
        queue.add(1);
        queue.add(5);
        queue.add(4);
        queue.add(3);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(10);
        queue.add(9);
        queue.add(2);
        while (!queue.isEmpty()){
            queueReversing.add(queue.peek());
            System.out.println(queue.poll());
        }
        while (!queueReversing.isEmpty()){
            System.out.println(queueReversing.poll());
        }
    }

}
