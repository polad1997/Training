package oca.enthuwaretests.test1;

public class Nine {
    public static void main(String[] args) {
        Object o1 = new Object();
        System.out.println(o1);
        someMethod(o1);
        System.out.println(o1);
    }

    public static void someMethod(Object x) {
        System.out.println(x);
        x = new int[9];  //eger pass by value oturulduyu zaman uzerinde value deyisikliyi olubsa yeni object yaranir
        System.out.println(x.hashCode());
    }
}
