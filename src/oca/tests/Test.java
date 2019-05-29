package oca.tests;

import java.util.ArrayList;
import java.util.List;

public class Test {

  public static void main(String[] args) {
    List list = new ArrayList();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("b");

    if (list.remove("b")) {
      System.out.println(list.remove("n"));
    }
    System.out.println(list);
  }


}
