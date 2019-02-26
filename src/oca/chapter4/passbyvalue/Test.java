package oca.chapter4.passbyvalue;

public class Test {
    /**
     * Bu zaman Same object print edecek cunki burada eyni
     * objecte append edilir
     */
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder();
        method(name);
        System.out.println(name);
    }

    public static void method(StringBuilder name){
        name.append("Same object");
        name = new StringBuilder("new object");
    }

}
