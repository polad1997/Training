package ocp.boyarski.chapter2.designinterface.functional.lambda;

/**
 * @author PoladA
 * @Date&Time 11/27/2019 10:56
 */
public class FindMatchingAnimals {

    private static void print(Animal animal, CheckTrait checkTrait) {

        if (checkTrait.test(animal)) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Fish", false, true);

        CheckTrait checkTrait = new CheckTrait() {
            @Override
            public boolean test(Animal a) {
                System.out.println("swimmer");
                return true;
            }
        };


        print(animal, checkTrait);
        print(new Animal("Horse", true, false), horse -> horse.canHop());

    }

}
