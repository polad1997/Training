package oca.chapter5.again.mushfig.hiding;

public class BMW extends Car {

    protected String color = "white";
    static int speed = 320;

    public static void main(String[] args) {
        BMW bmw = new BMW();
        System.out.println(bmw.speed);
    }

}
