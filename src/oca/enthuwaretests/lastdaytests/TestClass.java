package oca.enthuwaretests.lastdaytests;


public class TestClass {

  static int a;
  int b;

  public TestClass() {
    int c;
    c = a;
    a++;
    b += c;
  }

  public static void main(String args[]) {
    new TestClass();
  }
}


