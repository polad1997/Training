package oca.chapter5.again.mushfig.b;

import oca.chapter5.again.mushfig.a.A;

public class B extends A {

    int x = 5;

    public static void main(String[] args) {
        A a = new A();
        A ab = new B();
        System.out.println(((B) ab).x);
        System.out.println(((B) ab).aa());
    }

    int aa() {
        int a = super.x;
        return a;
    }
}
