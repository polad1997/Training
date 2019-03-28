package oca.chapter6.throwingsecondexception;

/**
 * Bu zaman aaaaa exceptionu tutur cunki birbasa finally scopa daxil olur
 */
public class Test {

    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            throw new RuntimeException("nnnnn");
        } finally {
            throw new RuntimeException("aaaaaaaaaaaa");
        }
    }
}
