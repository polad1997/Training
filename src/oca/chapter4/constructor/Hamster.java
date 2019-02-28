package oca.chapter4.constructor;

public class Hamster {

    private String color;
    private int weight;


    public static void main(String[] args) {

        Hamster hamster = new Hamster(3);
        System.out.println(hamster.color + hamster.weight);
    }

    static {
        System.out.println("cimi cimi ");  //main method dan evvel isleyecek
    }

    public Hamster(int weight) {
        this(weight, "red");
        new Hamster(weight, "green");  // Bu zaman main method daki object ile bu object eyni deiller
    }

    public Hamster(int weight, String color) {
        this.color = color;
        this.weight = weight;
    }
}
