package oca.chapter4.methods;

public class Test {
    public static void main(String[] args) {
        final int x = 15 ;
        _(x);
        System.out.println(x);
    }

    public void $() {

    }

    public static void _(int x) {
        System.out.println("method ->" + ++x );
    }
}
