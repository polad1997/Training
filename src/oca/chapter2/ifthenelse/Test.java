package oca.chapter2.ifthenelse;

public class Test {

    public static void main(String[] args) {
        int a = 22;

        if (a < 11) {

        }
        if (a >= 11) {

        }

        /**
         * her iki if sherti true oldugda else if halina baxmir
         */

        if (a < 44) {
            System.out.println("aaaaaaaaaaaa");
        } else if (a < 55) {
            System.out.println("vvvvvvvvvvvv");    //bunu cap etmir , eger else if yox if olsaydi print ederdi
        } else {
            System.out.println("aasdasdasdasasd");
        }

    }


}
