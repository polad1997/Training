package oca.chapter2.continuebreak;

public class Test {

    public static void main(String[] args) {
        First_loop:
        for (int a = 1; a <= 4; a++) {

            Second_loop:
            for (char x = 'a'; x <= 'c'; x++) {

                if (a == 2 || x == 'b') continue First_loop;
                System.out.print(" " + a + x);
            }

        }
    }

}
