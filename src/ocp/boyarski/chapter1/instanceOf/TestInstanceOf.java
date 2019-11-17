
package ocp.boyarski.chapter1.instanceOf;

class HeavyAnimal {

}

class Hippo extends HeavyAnimal {


}

class Elephant extends Hippo {
    HeavyAnimal hippo = new Hippo();

    boolean b1 = hippo instanceof Hippo;        //true
    boolean b2 = hippo instanceof HeavyAnimal;  //true
    boolean b3 = hippo instanceof Elephant;     //false

}

interface Mother {

}

class MotherHippo extends Hippo implements Mother {

}

public class TestInstanceOf {

    public static void main(String[] args) {

        HeavyAnimal hippo = new Hippo();
        boolean b1 = hippo instanceof Hippo;        //true
        boolean b2 = hippo instanceof HeavyAnimal;  //true
        boolean b3 = hippo instanceof Elephant;     //false
        System.out.println("b1 :::" + b1 + "  b2:::" + b2 + " b3 :::" + b3);

        Hippo anotherHippo = new Hippo();
        boolean b4 = anotherHippo instanceof Elephant;
        System.out.println("b4::: " + b4);

        boolean b5 = hippo instanceof Mother;
        System.out.println("b5:::" + b5);

        boolean b6 = hippo instanceof Mother;
        System.out.println("b6:::" + b6);
    }


}
