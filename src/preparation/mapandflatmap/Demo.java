package preparation.mapandflatmap;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("asd");
        list1.add("qqwqwwwwe");
        list1.add("z");
        list1.add("gfqqd");
        list1.add("werasd");
        System.out.println(list1);

        List listOfInt = list1.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println(listOfInt);


        List<List> listOfList = new ArrayList<>();
        listOfList.add(Arrays.asList(2, 4));
        listOfList.add(Arrays.asList(1, 3));
        listOfList.add(Arrays.asList(5, 6));
        listOfList.add(Arrays.asList(7, 8));

        System.out.println(listOfList);

        List listOfIntwithFlatmap = (List) listOfList.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println(listOfIntwithFlatmap);

        Map<String, List<String>> people = new HashMap<>();
        people.put("John", Arrays.asList("555-1123", "555-3389"));
        people.put("Mary", Arrays.asList("555-2243", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "555-3242"));
        System.out.println(people.values());
        List<String> phones = people.values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(phones);
    }
}
