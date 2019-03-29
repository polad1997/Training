package oca.chapter6.varioustypesexceptions;

public class MyException extends RuntimeException {
    MyException2 myException2 = new MyException2();
    MyException3 myException3 = (MyException3) myException2; //myExcep3 is subclass of myExcep2

    MyException3 myException3_ = new MyException3();
    MyException2 myException2_ = myException3_;  //myException2 is superclass

    String type = "moose";
    Object obj = type;
    Integer number = (Integer) obj;  // burada ClassCastExc atir cunki Integer Stringin subi deil

    public static void main(String[] args) {
        MyException myException = new MyException();
    }

}
