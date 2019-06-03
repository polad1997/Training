package oca.enthuwaretests.test;

public class Test4 {

    static void display(int num[]) {
        try {
            System.out.println(num[1] / num[1] - num[2]);
        } catch (ArithmeticException e) {
            System.out.println("first");
        }
        System.out.println("Done");
    }

    public static void main(String[] args) {

        try {
            int[] array = {100, 100};
            display(array);

        } catch (IllegalArgumentException e) {
            System.out.println("second");
        } catch (Exception e) {
            System.out.println("third");
        }

    }
}
