package oca.enthuwaretests.test;

public class Test8 {
}

class Msg {
    public static String doMsg(char x) {
        return "good day";
    }

    public static String doMsg(int y) {
        return "good luck";
    }

    public static void main(String[] args) {
        char x = 8;
        int z = '8';
        System.out.println(doMsg(x));
        System.out.print(doMsg(z));
    }
}