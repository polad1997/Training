package oca.tests;

public class TTTtest {

  public static void main(String[] args) {
    Float f = null;
    try {
      f = Float.valueOf("11");
      System.out.println(f + "1");
      String s = f.toString();
      System.out.println(s);
      double d = Double.valueOf(s);
      System.out.println(d);
      int i = Integer.valueOf(s);
      System.out.println(i);

    } catch (NumberFormatException e) {
      e.printStackTrace();
    }
  }

}
