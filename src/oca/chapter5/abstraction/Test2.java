package oca.chapter5.abstraction;

public class Test2 {
    public static void main(String[] args) {


        /**
         * abstract class cant instantiated directly
         */
        Test test = new Test() {
            @Override
            public void method2() {

            }

        };
    }
}
