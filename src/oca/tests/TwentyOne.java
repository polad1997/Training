package oca.tests;

public class TwentyOne {
    public static void main(String[] args) {
        String[] s = new String[2];
        int i = 0;
        for (String ss : s) {
            System.out.println(s[i].concat(" element " + i));
            i++;
        }
        System.out.println();
    }
}
