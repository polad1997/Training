package oca.tests;

public class SampleClass {

  public static void main(String[] args) {
    SampleClass sampleClass = new SampleClass();
    AnotherSampleClass asc = new AnotherSampleClass();
    SampleClass sc = new SampleClass();
//    sc = asc;
    ABC abc = new ABC();
//    sc = abc;
    System.out.println("sc: " + sc.getClass());
    System.out.println("asc: " + asc.getClass());
//    System.out.println(sampleClass.getClass());
  }
}

class AnotherSampleClass extends SampleClass {

}

class ABC extends AnotherSampleClass {

}
