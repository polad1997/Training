package ocp.boyarski.chapter2.designinterface.functional;

/**
 * @author PoladA
 * @Date&Time 11/27/2019 10:24
 */

@FunctionalInterface
public interface Sprint {

    void sprint(Animal animal);

}

class Animal {

}

class Tiger implements Sprint {

    @Override
    public void sprint(Animal animal) {
        System.out.println("tiger");
    }
}

interface Run extends Sprint {

}

interface SprintFaster extends Sprint {
    void sprint(Animal animal);
}

interface Skip extends Sprint {
    public default int getHopCount(Kangaroo kangaroo) {
        return 10;
    }

    public static void skip(int speed) {
    }
}

class Kangaroo {

}