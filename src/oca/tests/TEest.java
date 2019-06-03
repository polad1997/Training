package oca.tests;

public class TEest {

  public static void main(String[] args) {
    System.out.println(doo("1234"));
  }

  public static String doo(String card) {
    String x = "xxxx-xxxx-xxxx-";
    StringBuilder stringBuilder = new StringBuilder(card);
    stringBuilder.substring(15, 19);
    return x + stringBuilder;
  }

}
