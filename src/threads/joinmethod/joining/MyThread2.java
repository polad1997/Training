package threads.joinmethod.joining;

public class MyThread2 extends Thread {
    private final String name;
    private final Thread t;

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(name + " is running..." + i);
        }
    }

    MyThread2(String name) {
        this.name = name;
        t = new Thread(this, name);
    }
}
