package threads.javathread;

public class MyClass extends Thread {
    @Override
    public void run() {
        System.out.println("My Class is running");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.run();
    }
}
