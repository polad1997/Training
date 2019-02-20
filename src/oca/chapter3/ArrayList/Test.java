package oca.chapter3.ArrayList;

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

        List<String> strings2 = new ArrayList<>();
        strings2.add("polad");
        strings2.add("qurban");
        strings2.add("musu");
        strings2.remove(2);
        strings2.remove("20");
        System.out.println(strings2);

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.remove(1);
        integers.remove("3");   //object olaraq 3u silmir cunki Integer arraylist de ancaq index e baxir
        System.out.println(integers);
    }
}
