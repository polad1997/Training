package oca.chapter6.callingmethodsthrowsexceptions;


/**
 * main metod daxilindeki metod exception atirsa main metodda onu atmali (declare) yada tutmalisiniz(handle)
 */
public class Bunny {
    public static void main(String[] args) throws MyCheckedException {

        eat();
        try {
            eat();
        } catch (MyCheckedException e) {

        }
    }

    private static void eat() throws MyCheckedException {

    }
}
