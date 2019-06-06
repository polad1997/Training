package threads.multithreads;

public class MultiThread {

    public static void main(String[] args) {
        new MyThread("one");
        new MyThread("two");
        new MyThread("three");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread is exiting...");
    }
}
