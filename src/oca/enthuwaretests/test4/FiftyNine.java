package oca.enthuwaretests.test4;

public class FiftyNine {
    static int x = 5;

    public static void main(String[] args) {
        int x = (x = 3) * 4;
        System.out.println(x);
    }
}
