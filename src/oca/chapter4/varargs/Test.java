package oca.chapter4.varargs;

public class Test {
    public static void main(String[] args) {
        System.out.println(method1("a"));
        System.out.println(method1("b", 2, 2, 2, 2, 2, 2));

    }

    static public int method1(String s, int... adse) {
        return adse.length;
    }

}
