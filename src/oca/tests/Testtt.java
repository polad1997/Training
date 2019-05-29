package oca.tests;

public class Testtt {

  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder(3);
    String string = "";
    if (string.equals(stringBuilder)){
      System.out.println("vvv");
    }else if (string.toString().equals(stringBuilder.toString())){
      System.out.println("vvvvvvvvvv");
    }
  }

}
