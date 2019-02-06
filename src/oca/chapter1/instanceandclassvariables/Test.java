package oca.chapter1.instanceandclassvariables;

public class Test {

    static char ch;
    char ch1 = '\u0000';

    public static void main(String[] args) {
        System.out.println(ch);
        System.out.println(new Test().ch1 == ch);
    }

}
