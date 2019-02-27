package oca.chapter4.overloading;

public class Test {
    public static void main(String[] args) {
        method(2);  //primitive - try to print most specific parameter

    }
//    public static void method(int[] array){
//
//    }
    public static void method(int... array){

    }
    public static void method(int a){
        System.out.println("primitive");
    }
    public static void method(Integer a){
        System.out.println("wrapper");
    }
}
