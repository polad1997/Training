package oca.chapter3.equality;

import java.util.Arrays;

public final class Test {

    public static void main(String[] args) {
        String s1 = "Polad";
        String s2 = "Polad";
        System.out.println(s1 == s2);  //LITERAL -> String pool

        String s3 = new String("Polad");
        String s4 = new String("Polad");

        System.out.println(s3 == s4);  //new yeni object yaradir

        System.out.println(s1 == s3);  //new ile yarannan object literal yaranan objectden ferqlidir

        String[] bugs = {"p" , "o" , "l" , "a" , "d"};
        String[] alias = {"p" , "o" , "l" , "d" , "a"};
        System.out.println(bugs == alias) ;
        System.out.println(bugs.toString());
        System.out.println(Arrays.toString(bugs));
    }

}
