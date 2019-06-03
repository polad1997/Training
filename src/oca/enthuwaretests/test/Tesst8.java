package oca.enthuwaretests.test;

public class Tesst8 {

    void test(String str, StringBuilder sb) {
        str = str + sb.toString();
        sb.append(str);
        str = null;
        sb = null;

    }

    public static void main(String[] args) {
        String s = "aaa";
        StringBuilder sb = new StringBuilder("bbb");
        new Tesst8().test(s, sb);
        System.out.println("s" + s + " " + sb);
    }

}
