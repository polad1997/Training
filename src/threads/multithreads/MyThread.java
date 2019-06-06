package threads.multithreads;

public class MyThread implements Runnable {
    String name;
    Thread t;

    MyThread(String thread) {
        name = thread;
        t = new Thread(this, name);
        System.out.println("New thread is : " + t);
        t.start();
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread("myThread");
    }

    @Override
    public void run() {
        try {
            for (int i =5; i > 0; i--) {
                System.out.println(name + " : " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
        System.out.println(name + " exiting...");

    }
}
