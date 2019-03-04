package oca.chapter4.mushfiginkitabi;

public class Test2 {

    public static void main(String[] args) {

        Integer integer = new Integer(3);
        new Test2().probe(integer);

        int i = 3;
        new Test2().probe(i);
    }

    void probe(int... x) {
        System.out.println("In ...");
    }

    void probe(Integer x) {
        System.out.println("In Integer");
    }

    void probe(long x) {
        System.out.println("in long");
    }

    void probe(Long x) {
        System.out.println("In Long");
    }
}
