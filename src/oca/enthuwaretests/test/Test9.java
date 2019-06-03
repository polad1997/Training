package oca.enthuwaretests.test;

public class Test9 {
    public static void main(String[] args) {

        try {
            m1();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("!");

            try {
                throw new NullPointerException();
            } catch (NullPointerException k) {
                System.out.println("***");
            }

        } catch (NullPointerException e) {
            System.out.println("2");
            return;
        } catch (Exception e) {
            System.out.println("3");
        } finally {
            System.out.println("4");
        }
        System.out.println("end");
    }

    static void m1() {
        throw new IndexOutOfBoundsException();
    }
}
