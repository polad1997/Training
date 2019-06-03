package oca.chapter5.again.mushfig.hiding;

public class Car {

    protected String color = "default color";
    static double speed = 200;

    void getCarDetails() {
        System.out.println(color + " " + speed);
    }

}
