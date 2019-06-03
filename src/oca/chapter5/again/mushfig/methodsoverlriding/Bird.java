package oca.chapter5.again.mushfig.methodsoverlriding;

public class Bird {
    private void fly() {
        System.out.println("bird is flying");
    }

    public Integer getNum(){
        return 0;
    }

    public static void main(String[] args) {
        Bird bird = new Pelicann();
        bird.fly();
    }
}
