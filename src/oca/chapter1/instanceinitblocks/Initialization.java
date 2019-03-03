package oca.chapter1.instanceinitblocks;


/**
 * instance and static initializer blocks
 */
public class Initialization {

    public static void main(String[] args) {
        Initialization object = new Initialization();
        // instance blocka ancaq classin
        // objectini yaradarken daxil olur
        // ve bu block metodun xaricinde yazilir

    }

    {
        System.out.println("instance block");
    }

    static {
        System.out.println("static block");
    }

    public Initialization(){
        System.out.println("in the constructor");
    }
}


