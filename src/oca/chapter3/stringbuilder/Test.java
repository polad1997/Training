package oca.chapter3.stringbuilder;

public class Test {
    public static void main(String[] args) {

        /**
         * literal sb yaranmir!!!
         */
//        StringBuilder stringBuilder = "Polad";
        StringBuilder stringBuilder = new StringBuilder("Polad");

        StringBuilder stringBuilder1 = new StringBuilder(2); //Default capacity for sequence of chars
        stringBuilder1.append(2);
        stringBuilder1.append(2);
        stringBuilder1.append(2);
        stringBuilder1.append(2);
        stringBuilder1.append(2);
        stringBuilder1.append(2);
        stringBuilder1.append(2);
        stringBuilder1.append(2);
        stringBuilder1.append(2);
        System.out.println(stringBuilder1 + "border!");

        stringBuilder.append(stringBuilder);
    }
}
