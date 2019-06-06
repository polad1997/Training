package threads.joinmethod.joining;

public class TestJoin {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("thread 1");
        MyThread2 t2 = new MyThread2("thread 2");

        try {
            t1.start();
            t1.join();
            t2.start();
//            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
