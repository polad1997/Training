package oca.chapter1.understandingvariablescope;

import oca.chapter1.instanceandclassvariables.Test;

public class Mouse {

    static int MAX_VALUE = 5;
    int length;

    public static void main(String[] args) {
        System.out.println(new Mouse().length);
        System.out.println(new Mouse().grow(4));
        System.out.println(new Mouse().length);  //pass by value -> 0
    }

    public int grow(int inches) {
        if (length < MAX_VALUE) {
            int newSize = length + inches;
            length = newSize;
        }
        return length;
    }

}
