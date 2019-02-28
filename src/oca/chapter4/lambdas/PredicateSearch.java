package oca.chapter4.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class PredicateSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("fish1", false, true));
        animals.add(new Animal("fish2", false, true));
        animals.add(new Animal("fish3", false, true));

        print(animals, a -> a.canHop());

        List<String> animals1 = new ArrayList<>();
        animals1.add("asdad");
        animals1.add("fgdfgdfg");
        animals1.add("3333");
        animals1.removeIf(a -> a.charAt(1) == 's');
        System.out.println(animals1);
    }

    public static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) System.out.println(animal + " ");
        }
        System.out.println();
    }

}
