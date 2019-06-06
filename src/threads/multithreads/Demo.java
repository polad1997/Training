package threads.multithreads;

public class Demo {
    private static int count = 0;

    public static synchronized void inccount() {
        count++;
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    inccount();
                    System.out.println("count in thread 1 -> " + count);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    count++;
                    System.out.println("count in thread 2 -> " + count);
                }
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();

//            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("count is : " + count);
    }

}
