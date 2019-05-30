package udemy.bootcamp.algosdatascructures.reverseint;

public class ReverseInt {

  public static void main(String[] args) {
    ReverseInt reverseInt = new ReverseInt();
    System.out.println(reverseInt.reverseInt(987654321));
  }

  public int reverseInt(int input) {

    int lastElement = 0, bolunen = input, reversedInput = 0;
    for (int i = 0; i < input; i++) {

      lastElement = bolunen % 10;   //3  8

      if (bolunen / 10 != 0) {
        reversedInput = (reversedInput + lastElement) * 10;
        System.out.println("ReversedInput -> " + reversedInput);
      } else {
        reversedInput = (reversedInput + bolunen);
        System.out.println("else -> " + reversedInput);
        break;
      }
      bolunen = bolunen / 10;
      System.out.println("Bolunen -> " + bolunen);

    }

    return reversedInput;  //123456789
  }

}
