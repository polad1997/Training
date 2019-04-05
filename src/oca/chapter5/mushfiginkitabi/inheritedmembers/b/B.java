package oca.chapter5.mushfiginkitabi.inheritedmembers.b;

import oca.chapter5.mushfiginkitabi.inheritedmembers.a.A;

public class B extends A {

    int k = 5;

    public void print() {
        A a = new A();
        B b = new B();
        System.out.println(k + b.k);  //10
        System.out.println(b.k);

        System.out.println(k + super.k); //15

        /***
         * Parent class ve child class ferqli paketlerdedirse
         * bu zaman parent classin protected uzvlerine ancaq ve ancaq
         * child classin referancesi ile chatmaq mumkundur !!!!!!!!!!!!
         */

        System.out.println(k + b.n); // 20
//        System.out.println(k + a.n); //Compile error

    }

    public static void main(String[] args) {
        B b = new B();
        b.print();
    }


}
