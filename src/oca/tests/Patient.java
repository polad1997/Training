package oca.tests;

import java.util.ArrayList;
import java.util.List;

public class Patient {

  String name;

  public Patient(String name) {
    this.name = name;
  }

}

class Tessfst {

  public static void main(String[] args) {
    List ps = new ArrayList();
    Patient p2 = new Patient("Mike");
    ps.add(p2);
    int f = ps.indexOf(p2);

    //insert code here
    if (f >= 0) {
      System.out.print("Mika found");
    }
  }
}

class Msg {

  public static String doMsg(char x) {
    return "day";
  }

  public static String doMsg(int y) {
    return "luck";
  }

  public static void main(String[] args) {
    char x = 8;
    int z = '8';
    System.out.println(doMsg(x));
    System.out.print(doMsg(z));
  }
}