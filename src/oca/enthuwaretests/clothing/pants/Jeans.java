package oca.enthuwaretests.clothing.pants;

import static oca.enthuwaretests.clothing.Shirt.getColor;

public class Jeans {

    public void match() {

        String color = getColor();
        if (color.equals("Green")) {
            System.out.println("Fit");
        }

    }

    public static void main(String[] args) {
        Jeans jeans = new Jeans();
        jeans.match();
    }

}
