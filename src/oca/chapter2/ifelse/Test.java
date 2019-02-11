package oca.chapter2.ifelse;

public class Test {

    public static void main(String[] args) {
        int x = 3;
        if (x < 5) {
            System.out.println("aa");
        } else if (x < 4) {
            System.out.println("bb");    //Unreachable code !!!
        }

        int y = 10;
        System.out.println((y > 5) ? 3 : "aaa");
//        int v = (y > 5) ? 3 : "aaa";  does not compile
    }

}
