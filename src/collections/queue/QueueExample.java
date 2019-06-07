package collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue queue = new LinkedList();

        for (int i = 0; i < 5; i++) {
            queue.add(i);
        }

        System.out.println("elements of queue : " + queue);

        int removed_element = (int) queue.remove();
        System.out.println("removed element : " + removed_element);

        int poll = (int) queue.poll();
        System.out.println("poll : " + poll); // headi remove edir ve print edir
        System.out.println("elements of queue : " + queue);

        int peek = (int) queue.peek();
        System.out.println("peek : " + peek);

    }
}
