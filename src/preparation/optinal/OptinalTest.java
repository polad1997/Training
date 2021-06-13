package preparation.optinal;

import java.util.Arrays;

public class OptinalTest {
   static int min1 = Arrays.stream(new int[]{1, 2, 3, 4, 5})
            .min()
            .orElse(0);

   static String min2 = Arrays.stream(new int[]{})
            .min().toString();

    public static void main(String[] args) {
        System.out.println(min2);
    }
}
