package oca.chapter5.callinginheritedmembers;

public class Fish {

    protected int size;
    private int age ;

    public Fish(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
