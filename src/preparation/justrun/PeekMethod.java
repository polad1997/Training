package preparation.justrun;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PeekMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 20; i++) {
            list.add(i);
        }
        System.out.println(list);
        list.stream().peek(System.out::print).collect(Collectors.toList());

        List<Integer> newList = list.stream()
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
