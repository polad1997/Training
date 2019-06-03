package oca.chapter3;

public class Test {
    public static void main(String[] args) {
        Float f = Float.valueOf("11");
        String s = f.toString();
        double d = Double.valueOf(s);
        int i = Integer.parseInt(s);
        System.out.println(d + i);
    }
}
