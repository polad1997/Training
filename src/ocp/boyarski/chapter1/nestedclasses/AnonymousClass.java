package ocp.boyarski.chapter1.nestedclasses;

public class AnonymousClass {

    public static abstract class Sale {
        public abstract void calc();
    }

    public void test() {
        Sale sale = new Sale() {
            @Override
            public void calc() {
                System.out.println("bingo!");
            }
        };
    }

    public static void main(String[] args) {

        AnonymousClass a = new AnonymousClass();
        a.test();

    }
}
