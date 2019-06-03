package oca.enthuwaretests.test;

public abstract class Book implements Readable {

    @Override
    public void read() {
        System.out.println("read book");
    }
}
