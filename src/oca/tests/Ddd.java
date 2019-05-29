package oca.tests;

import java.util.ArrayList;
import java.util.List;

public class Ddd {

}

interface Contract {

}

class Super implements Contract {

}

class Sub extends Super {

}

class MyFor3 {

  public static void main(String[] args) {
    int[] xx = null;
    for (int ii : xx) {
      System.out.println(ii);
    }
  }
}
