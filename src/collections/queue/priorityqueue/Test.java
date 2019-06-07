package collections.queue.priorityqueue;

import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<String> strings = new PriorityQueue<>();
        strings.add("dishes");
        strings.add("laundry");
        strings.add("bills");
        strings.offer("bills");
        System.out.print(strings.size() + " " + strings.poll());
        System.out.print(" " + strings.peek() + " " + strings.poll());
        System.out.println(" " + strings.poll() + " " + strings.poll());
    }
}
