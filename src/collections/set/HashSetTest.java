package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetTest {

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        hashSet.add(4);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(5);
        hashSet.add(1);
        System.out.println(hashSet);

        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(4);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(5);
        System.out.println(linkedHashSet);
    }
}
