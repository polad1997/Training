package collections.list;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(6);
        System.out.println(arrayList);
        System.out.println(arrayList.get(4));
        System.out.println(arrayList.size());
    }
}
