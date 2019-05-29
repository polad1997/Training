package oca.tests;

public class FortyTwo {

  String myStr = "7007";

  public void doStuff(String str) {
    int myNum = 0;
    try {
      String myStr = str;
      myNum = Integer.parseInt(myStr);

    } catch (Exception e) {

    }

    System.out.println(myStr + "   " + myNum);

  }

  public static void main(String[] args) {
    FortyTwo fortyTwo = new FortyTwo();
    fortyTwo.doStuff("9009");
  }
}
