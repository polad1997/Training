package oca.chapter4.constructor;

public class Test {
    int anInt;
    String string;
    double doubleADouble;

    public static void main(String[] args) {
        Test test = new Test(2, "s", 3);
        System.out.println(test.anInt);
    }

    public Test(int i, String string, double d) {
        i = this.anInt;  // -> Bu zaman anInt i ye menimsedilir yeni 0 olur
//        this.anInt = i;
        string = string;  // -> globala cixa bilmir ikiside local stringlerdir

    }
}
