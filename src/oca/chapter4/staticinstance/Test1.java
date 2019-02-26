package oca.chapter4.staticinstance;

public class Test1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.method3();
        method1();
    }

    public static void method1() {
        Test1 test1 = new Test1();
        test1.method3();
    }

    public void method2() {
        method1();  // Instance statici qebul edir eksi compile error verir
    }

    public void method3() {
        method2();
        Test1 test1 = new Test1();
        test1.method2();
    }
}
