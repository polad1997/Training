package oca.chapter2.compoundassignment;

/**
 * compound assignment operator
 * castingi ozu daxilinde edir
 */

public class Test {
    public static void main(String[] args) {
        int a = 5;
        long b = 5;
        b *= a;
        b = b * a;
        a *= b;
//        a = a * b; //bu zaman ya yuxaridaki kimi yazilmali
                    //yada cast olunmalidir

    }
}
