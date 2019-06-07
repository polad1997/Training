package collections.compare.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> arrayList = new ArrayList();
        arrayList.add(new Movie("AAA", 3, 2010));
        arrayList.add(new Movie("BBB", 2, 2011));
        arrayList.add(new Movie("CCC", 1, 2012));
        arrayList.add(new Movie("DDD", 4, 2013));

        Collections.sort(arrayList);

        System.out.println("after sorting");

        for (Movie m : arrayList) {
            System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear() + " ");
        }
    }
}
