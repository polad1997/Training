package oca.enthuwaretests;

public class C1 extends C2 implements I {
    @Override
    public void displayI() {
        System.out.println("C1");
    }

    public static void main(String[] args) {

        C2 o1 = new C1();
        I o2 = new C1();

        C2 s = (C2) o2;
        I t = (I) o1;

        t.displayI();
        s.displayC2();
    }
}
