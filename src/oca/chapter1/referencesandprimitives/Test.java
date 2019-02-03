package oca.chapter1.referencesandprimitives;

public class Test {

    public static void main(String[] args) {

        /**
         *
         * by default olaraq java butun literallara int kimi yanasir
         *  buna gorede asaqida ededin long oldugunu bildirmekcun
         *  L i artirmaq lazimdir
         *
         */
        long max = 9999999999L;
        int a = 999999999;

        /**
         * int long un icerisine yerlesir
         * */
        long a1 = a;

        /**
         * int den balaca deyerler , int in icerisine yerlesir
         * */
        short sh = 12312;
        int sh1 = sh;
        byte b = 123;
        int b1 = b;

        /**
         * numeric literal uzun olduqda underscore _ istifade ede bilerik
         *      java7 feature
         * */
        int million = 100000000;
        int million1 =  1_000_000_000; // yadaki
        int million2 = 1_0_0_0_0_0_0_0;
        double million3 = 100_00.0_00; //. isaresi ancaq double ve floata aiddir


    }

}
