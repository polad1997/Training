package oca.enthuwaretests.test1;

public class TwentySix {
    public static void main(String[] args) throws Exception {
        try {

            m1();      //burada main metodunun Exceptionu tutulsada m1() den gelen exception tutulmur
            System.out.println("try");
        } finally {
            System.out.println("finally ");
        }
        System.out.println("main");
    }

    public static void m1() throws Exception {
        throw new Exception();
    }
}
