package oca.chapter3continue.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        System.out.println(arrayList.size());

        List<String> strings = new ArrayList<>(2);
        strings.add("Polad");
        strings.add(1, "Alqayev");
        strings.add(0, "Elman");
        strings.add(1, "Aaaaa000");
        System.out.println(strings);

        List<String> strings1 = new ArrayList<>();
        strings1.add("aaaaaa");
//        strings.set(0 , "bbbb") ;
        System.out.println(strings1.set(0, "bbbb"));  // bu zaman evez etdiyi elementi print edir 
        System.out.println(strings1);
    }
}
