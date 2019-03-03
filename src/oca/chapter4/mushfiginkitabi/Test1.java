package oca.chapter4.mushfiginkitabi;

import java.util.Arrays;

public class Test1 {

    static int anInt;
    int anInt1;

    public static void main(String[] args) {
       int i = anInt;
       method();
    }
    static void method() {
//        anInt;            ****Static member instance memberi birbasa cagira bilmez
        Test1 test1 = new Test1();
        int i = test1.anInt1;
    }
    void method2() {
        method();
    }
    void method3(){
        method2();  //************instance method daxilinde instance methodu object olmadan caghirmag olar
    method();
    }
}
