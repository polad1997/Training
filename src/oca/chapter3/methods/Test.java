package oca.chapter3.methods;

public class Test {
    public static void main(String[] args) {
        String string = "PoladAlqayev";
        String string2 = "sss2222";


        System.out.println(string.indexOf("A"));
        System.out.println(string.indexOf("olad"));
        System.out.println(string.indexOf("a", 4));
        System.out.println(string.indexOf("ayev", 6));
        System.out.println(string2.indexOf(3));   //Compile olur amaki -1 verir , WHY ???

//        System.out.println(string.substring(3, 2));
        System.out.println(string.substring(2, 5));

        String string3 = string.toUpperCase();  //new object is creating
        System.out.println(string.hashCode() + " , " + string3.hashCode());

        System.out.println(string3.replace("OLAD" , "olad"));
    }
}
