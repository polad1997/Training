package ocp.boyarski.chapter2.designinterface.functional.lambda;

import java.util.function.Predicate;

/**
 * @author PoladA
 * @Date&Time 11/27/2019 11:48
 */
public class FindAnimalsPredicate {

    private static void print(Animal animal, Predicate<Animal> trait) {
        if (trait.test(animal))
            System.out.println(animal);
    }

    public static void main(String[] args) {
        print(new Animal("fish", false, true), a -> a.canHop());
        print(new Animal("kangaroo", true, false), a -> a.canHop());
    }

}
