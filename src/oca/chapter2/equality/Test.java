package oca.chapter2.equality;

import java.io.File;

public class Test {

    public static void main(String[] args) {

        File x = new File("a");
        File y = new File("a");
        File z = x;
        System.out.println(x == y); //false
        System.out.println(x == z); //true
        System.out.println(y == z); //false
    }
}
