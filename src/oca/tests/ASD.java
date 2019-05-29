package oca.tests;

import java.time.LocalDate;

public class ASD {

  public static void main(String[] args) {
    LocalDate localDate = LocalDate.of(2012 , 4 , 30);
    localDate.plusDays(2);
    System.out.println(localDate);
  }

}
