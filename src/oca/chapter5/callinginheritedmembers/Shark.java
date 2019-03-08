package oca.chapter5.callinginheritedmembers;

public class Shark extends Fish {

    private int numberOfFins = 8;

    public Shark(int age) {
        super(age);
        this.size = 4;
    }

    public void method() {
        System.out.println("Shark with age : " + getAge());
        System.out.println(" and " + size + " meters long");
        System.out.println(" with " + numberOfFins + " fins");

    }

    public static void main(String[] args) {
        new Shark(2).method();
    }
}
