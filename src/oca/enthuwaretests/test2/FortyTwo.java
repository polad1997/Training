package oca.enthuwaretests.test2;

import java.util.Arrays;

public class FortyTwo {
    public static void main(String[] args) throws Exception {
        int[] a = null;
        System.out.println(a);
//        int i = a[m1()];
    }

    public static int m1() throws Exception {
        throw new Exception("Some Exception");
    }
}
