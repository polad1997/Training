package oca.chapter3continue.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());


        LocalDate localDate = LocalDate.of(2019, Month.FEBRUARY, 19);
//        LocalDate localDate1 = LocalDate.of(2019, 13, 19);  //Exception

        LocalTime localTime = LocalTime.of(15, 30, 22, 22);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);


    }

}
