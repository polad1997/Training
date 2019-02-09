package oca.chapter2.compoundassignment;

public class Attention {
    public static void main(String[] args) {
        long x = 5;
        long y = (x = 3);
        System.out.println(x);
        System.out.println(y);
    }
}
