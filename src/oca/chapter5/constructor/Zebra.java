package oca.chapter5.constructor;

public class Zebra extends Animal {
    public Zebra(int age) {
        super(age);
    }

    public Zebra() {
    this(4);     //bu constructor parametrli Zebra connstructorunu cagirir
    }
}
