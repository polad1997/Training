package oca.tests.pbv;

public class Testwew {
    public static void main(String[] args) {
        String s = "aaa";
        StringBuilder sb = new StringBuilder("bbb");
        display(s, sb);
        System.out.println(s.hashCode() + " " + sb.hashCode());
    }

    public static void display(String s, StringBuilder sb) {
        sb = sb.append("s");
        System.out.println(sb.hashCode());
        s = s + "sss";
        System.out.println(s.hashCode());
    }
}
