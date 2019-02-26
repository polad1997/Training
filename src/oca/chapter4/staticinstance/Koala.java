package oca.chapter4.staticinstance;

public class Koala {

    static int count;
    public static void main(String[] args) {
        Koala k = new Koala();
        System.out.println(count);
        k =null;
        System.out.println(count);
    }

}
