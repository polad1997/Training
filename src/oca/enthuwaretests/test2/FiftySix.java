package oca.enthuwaretests.test2;

public class FiftySix {
}

class Aa {
    Aa() {
        print();
    }

    void print() {
        System.out.println("A");
    }
}

class Bb extends Aa {
    int i = 4;

    public static void main(String[] args) {
        Aa a = new Bb();
        a.print();
    }

    void print() {
        System.out.println(i);
    }
}