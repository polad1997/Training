package oca.enthuwaretests;

import java.time.LocalDate;

public class Test1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2012, 1, 32);
        localDate.plusDays(10);
        System.out.println(localDate);
    }
}
