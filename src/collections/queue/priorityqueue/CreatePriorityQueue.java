package collections.queue.priorityqueue;

import java.util.PriorityQueue;

public class CreatePriorityQueue {

    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.add(700);
        priorityQueue.add(900);
        priorityQueue.add(500);
        priorityQueue.add(100);

        System.out.println(priorityQueue);
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
        System.out.println(priorityQueue);
    }
}
