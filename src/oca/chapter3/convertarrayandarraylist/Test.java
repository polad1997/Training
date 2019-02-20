package oca.chapter3.convertarrayandarraylist;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("polad");
        strings.add("alqayev");
        Object object[] = strings.toArray();
        System.out.println(Arrays.toString(object));

//        String[] strings1 = (String[]) strings.toArray();
//        String[] strings2 = strings.toArray(new String[]{"aaaaa"});  //????????????
        String[] strings2 = strings.toArray(new String[1]);   // ????????;
        System.out.println(Arrays.toString(strings2));


        /**
         *Array -> List **************************
         */
        List<String> strings1 = new ArrayList<>();
        strings1.add("a");
        strings1.add("b");
        strings1.add("c");

        Object[] objects = strings1.toArray(); // method ya object massivi yada generic massiv qaytarir
        System.out.println(Arrays.toString(objects));
        String[] strings3 = strings1.toArray(new String[2]); //bu methoddan generic string massivi qayidir

        /**
         * List -> Array ******************************
         */
        String[] array = {"polac", "polad1", "polad2"};
        List<String> list = Arrays.asList(array);   //Bu zaman qayidan list fixed size list dir yeni listin
                                                   // length si birbasa olaraq arraydan asilidir
        //set() -> SUCCESS
        //add() & remove() -> EXCEPTION
    }
}
