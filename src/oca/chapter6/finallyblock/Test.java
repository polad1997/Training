package oca.chapter6.finallyblock;

public class Test {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("aaaa");
        } finally {
//            throw new Exception();
            System.out.println("ffff");
        }
    }

}
