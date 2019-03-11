package oca.chapter5.hidingvariables;

public class Rodent {
    protected int tailLenngth = 4;

    public void getRodentDetails() {
        System.out.println("[parentTail = " + tailLenngth + " ]");
    }
}
