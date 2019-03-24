package oca.chapter5.mushfiginkitabi.test;

public class Main {
    public static void main(String[] args) {
        new Main().test((Parent) new Object());
    }

    public void test(Parent parent) {
        System.out.println(parent.age);
    }
}
