package ocp.boyarski.chapter1.instanceOf;

public class TestAnimal {

    public static void main(String[] args) {


        Animal2 animal2 = new Dog();  //upasting
//        testAnimal(animal2);

        Bird bird = new Animal();
        testAnimal((Animal) bird);

    }

    public static void testAnimal(Animal animal) {



    }
}

class Animal2 {

}

class Dog extends Animal2 {

}

class Animal extends Bird {


}

interface IBird {

    void addSeed();

}

interface ICow {

    void addHay();

}

interface ILion {

    void addMeat();

}

class Bird {

}

class Lion {


}

class Cow {

}
