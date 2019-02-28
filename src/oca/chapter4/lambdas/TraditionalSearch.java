package oca.chapter4.lambdas;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("frog", true, true));

        print(animals, new CheckIfHopper());
        print(animals , animal -> animal.canHop());
        print(animals , animal -> animal.canSwim());
        print(animals , (Animal a) -> {return a.canHop();});
    }

    public static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) System.out.println(animal + " ");
        }
        System.out.println();
    }
}
