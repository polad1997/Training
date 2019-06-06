package threads.joinmethod.joining;

public class MyThread1 extends Thread {
    String name;
    Thread t;

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(name + " is running..." + i);
        }
    }

    MyThread1(String name) {
        this.name = name;
        t = new Thread(this, name);
    }

}
