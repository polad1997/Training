package oca.chapter5.again.mushfig.hiding;

public class Panda extends Bear {

    /**
     * Static methodlari override etmek olmur ancaq hiding olur
     */
    @Override
    protected void wakeUp() {
        System.out.println("Panda wake up");
    }

//    public static void eat() {
//        System.out.println("Panda is eating");
//    }

    public static void sleep() {

    }

    public static void main(String[] args) {
        Bear obj = new Panda();
        obj.wakeUp();
        obj.eat();
        Panda panda = new Panda();
        panda.eat();
        eat();

    }

}
