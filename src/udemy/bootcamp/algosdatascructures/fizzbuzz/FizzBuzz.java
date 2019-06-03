package udemy.bootcamp.algosdatascructures.fizzbuzz;

import java.util.Arrays;

public class FizzBuzz {

  public static void main(String[] args) {
    String arr[] = new String[100];
    for (Integer i = 0; i < 100; i++) {
      arr[i] = i.toString();
      if (i % 15 == 0 && i >= 15) {
        arr[i] = "FizzBuzz";
      } else if (i % 3 == 0 && i >= 3) {
        arr[i] = "Fizz";
      } else if (i % 5 == 0 && i >= 5) {
        arr[i] = "Buzz";
      }
    }
    System.out.println(Arrays.toString(arr));

  }

}
