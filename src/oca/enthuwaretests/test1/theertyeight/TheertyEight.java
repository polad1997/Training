package oca.enthuwaretests.test1.theertyeight;

public class TheertyEight {
    public static void main(String[] args) {
        Super aSuper = new Super();
        Sub sub = new Sub();

        aSuper = (Super) sub;
        sub = (Sub) aSuper;
    }
}
