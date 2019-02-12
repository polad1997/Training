package oca.chapter2.mushfiginkitabi;

public class Test {

    public static void main(String[] args) {
        System.out.println(8 % -3);

        short a = 2;
        short b = 3;
        b *= a;  //automatic casting

        String x = null;
        if (x != null & x.length() < 4) {  //bu zaman (&) her iki side yoxlanir
            System.out.println("sds");
        } else if (x != null && x.length() < 4) {  //bu zaman birinci teref neticeye tesir edirse ikinci terefe baxmir
            System.out.println("asd");
        }
        String bb = "";
        String aa = "";
        final String word = 23 > 33 ? aa : (bb = "a");

        switch (1) {
            default:
                System.out.println("asdasdasdasdasd");
        }



    }
}
