package oca.chapter5.hidingstaticmethods;

import sun.security.krb5.internal.PAData;

public class Panda extends Bear {
    /**
     * Hiding static method
     * Inherited classda method static dirse subclassdada eele olmalidir
     * Static deilse subclasdada static olmamalidir
     */
    public static void eat() {    //Bu zaman bear daki eat metodunu override elemese de
                                //panda eat() metodu mutleq static olmalidir
        System.out.println("Panda eat()");

    }

    public static void main(String[] args) {
        Panda.eat();
        Bear.eat();
    }


}
