package oca.chapter6.printinganexception;

public class Test {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("TEST exception");
        } catch (RuntimeException e) {
            System.out.println( e);
            System.out.println();
            System.out.println( e.getMessage());
            e.printStackTrace();
        }
    }
}
