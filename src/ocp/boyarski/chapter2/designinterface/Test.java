package ocp.boyarski.chapter2.designinterface;

/**
 * @author PoladA
 * @Date&Time 11/25/2019 16:21
 */

/**
 * @author PoladA
 * @Date&Time 11/25/2019 16:21
 */

public class Test {

}

class Lion implements Run {

    @Override
    public boolean canHunt() {
        return false;
    }

    @Override
    public boolean isWalk() {
        return false;
    }

    @Override
    public double getMax() {
        return 0;
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.test();
    }

}

interface Run extends Walk {

    public abstract boolean canHunt();

    abstract double getMax();

    default void test() {
        System.out.println("run default");
    }

}

interface Walk {

    boolean isWalk();

    abstract double getMax();

    default void test() {
        System.out.println("walk default");
    }

}