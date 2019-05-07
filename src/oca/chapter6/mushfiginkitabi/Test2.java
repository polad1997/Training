package oca.chapter6.mushfiginkitabi;

public class Test2 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            throw new Exception();
        } finally {
            throw new RuntimeException();  //bu zaman sonuncu exception tutulur
        }
    }
}
