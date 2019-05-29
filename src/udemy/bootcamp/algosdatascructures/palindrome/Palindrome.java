package udemy.bootcamp.algosdatascructures.palindrome;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String word = scanner.nextLine();
    char[] wordArray = word.toCharArray();
    char[] reversedArray = new char[wordArray.length];
    int j = 0;
    String reversedWord = "";

    for (int i = (wordArray.length - 1); i >= 0; i--) {
      reversedArray[j] = wordArray[i];
      j++;

      if (wordArray.length == reversedArray.length) {
        j--;
      }

      reversedWord += reversedArray[j];

    }

    System.out.println(reversedWord);
    System.out.println(checkPalindrome(word, reversedWord));

  }

  public static boolean checkPalindrome(String s1, String s2) {
    if (s1.equals(s2)) {
      return true;
    }
    return false;
  }

}
