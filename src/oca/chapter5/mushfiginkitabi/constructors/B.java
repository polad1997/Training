package oca.chapter5.mushfiginkitabi.constructors;

public class B extends A {
    int j;
    int k = 3;

    public B(int y) {
        super(y * 2);
        j = y;
    }

    public  void main1() {
        A a = new A(2);
        System.out.println(k + a.k);
    }

    public static void main(String[] args) {
        new B(2).main1();
    }
}
