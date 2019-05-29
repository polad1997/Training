package oca.tests;

import java.util.ArrayList;
import java.util.List;

public class O1 {


  static void dispResult(int[] num) {
    try {
      System.out.println(num[1] / num[1] - num[1]);
    } catch (ArithmeticException e) {
      System.err.println("1");
    }
    System.out.println("d");
  }

  public static void main(String[] args) {
    try {
      int[] arr = {100, 100};
      dispResult(arr);
    } catch (IllegalArgumentException e) {
      System.err.println("2");
    } catch (Exception e) {
      System.err.println("3");
    }
  }

}
