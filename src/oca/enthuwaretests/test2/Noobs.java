package oca.enthuwaretests.test2;


public class Noobs {
    public Noobs() {
        try {
            throw new MyException1();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        Noobs a = new Noobs();
        Noobs b = new Noobs();
        Noobs c = a;
    }
}

class MyException1 extends Exception {
}