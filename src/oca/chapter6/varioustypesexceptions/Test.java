package oca.chapter6.varioustypesexceptions;

public class Test {
    public static void main(String[] args) {
        try {
            throw new MyException3();
        } catch (MyException2 e) {
            System.out.println("Superclass");
//        } catch (MyException3 e) {
//            System.out.println("Subclass");  Bu zaman MyException3 tutulduqundan tekraren yazildiqda
//                                                compile error verir
//        }
        }
    }
}
