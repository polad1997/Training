package collections.queue.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCustomComparatorExample {
    public static void main(String[] args) {


        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(stringComparator);
        priorityQueue.add("lisa");
        priorityQueue.add("robert");
        priorityQueue.add("john");
        priorityQueue.add("chris");
        priorityQueue.add("angelina");
        priorityQueue.add("joe");

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}