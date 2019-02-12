package oca.chapter2.logicaloperators;

public class Test {
    public static void main(String[] args) {

        int x = 6;
        boolean y = (x >= 6) || (++x <= 7); // bu zaman || bunun ikinci hissesine baxmir cunki
                                                //OR - da bir terefin true olmasi enough
        System.out.println(x);
    }

}
