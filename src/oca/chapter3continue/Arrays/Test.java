package oca.chapter3continue.Arrays;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        String[] strings = {"asdasd"};
        Object[] objects = strings;
        String[] strings1 = (String[]) objects;
        strings1[0] = new String();
//        strings1[1] = new StringBuilder();   String only allows String objects
//        objects[0] = new StringBuilder();  //Throws exception

        String[] s = {"1", "a", "A", "33", "09", "9", "x", "Z", "-", "#"};
        Arrays.sort(s);
        for (String e : s) {
            System.out.println(e);
        }

        String[][] s2 = {{"22" , "dgg" , "g"} , {"d"} , {"df" , "ww"}};
        System.out.println(s2[1][0]);
    }
}
