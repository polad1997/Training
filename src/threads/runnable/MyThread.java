package threads.runnable;

public class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId() + " is running");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.start();
        Thread thread1 = new Thread(new MyThread());
        thread1.start();
    }
}
