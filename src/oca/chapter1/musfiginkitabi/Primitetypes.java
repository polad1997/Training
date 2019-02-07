package oca.chapter1.musfiginkitabi;

public class Primitetypes {

    long i1 = 100000000L;
    int i2 = 202002029;
    int a = new Integer(3);

    int _234fsfs = 9;  //identifier _ ile baslaya biler


    /**
     * asaqidaki kod compile error verir
     * <p>
     * <p>
     * int a1 = 2 ;
     * char a2 = a1;  // cast olunmalidir  yada int final olmalidir
     */

    //******************************

    char a3 = (char) -29; //char menfi qiymet almir lakin cast etdikde compile olur
    char a4 = (char) 80000000;


    //***********************
    char p = 'm';
    long h = p;
    int k = p;

    public static void main(String[] args) {

        System.out.println(new Primitetypes().k);

    }


}
