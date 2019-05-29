package oca.enthuwaretests.test4;

import java.util.ArrayList;

public class SixtyNine {

  public static void main(String[] args) {
    ArrayList arrayList = new ArrayList();
    String[] strings;
    try {
      while (true) {
        arrayList.add("my string");
      }
    } catch (RuntimeException e) {
      System.out.println("rrrr");
    }
  }

}
