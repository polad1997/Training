package oca.tests;

public class TheertyFour {
    public static void main(String[] args) {
        int i = 200;
        String s = "bb";
        System.out.println(calc(i));
        System.out.println("aaa" + i);
        change(s);
        System.out.println(s);
    }

    static int calc(int i) {
        i = i * 2;
        return i;
    }

    static String change(String s) {
        s = s + " asdasda";
        return s;
    }
}
