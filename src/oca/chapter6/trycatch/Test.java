package oca.chapter6.trycatch;

public class Test {
    public static void main(String[] args) {
        try {
            throw new Throwable();
//            System.out.println("aaaa"); // unreachable statement
        } catch (Exception e) {
            System.out.println("aaaaaaaaaaaaaaa");
        } catch (Throwable e) {
            System.out.println(" vvvv");
        }

    }
}
