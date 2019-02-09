package oca.chapter2.numericpromotion;

public class Test {
    public static void main(String[] args) {

        Short a = 33, b = 3;
//        Short c = a/b ;  //Compile error verir cunki bolme zamani onlar short yox inte promote olurlar
        System.out.println((a / b)); // bu zaman short deyisenler operationdan qabag int e promote olurlar

        short s = 2;
        float f = 3;
        double d = 4;

        /**
         *  short -> int -> float -> double
         */

        double result = s * f / d; // bu zaman balacadan boyuye dogru promote edilir


    }

}
