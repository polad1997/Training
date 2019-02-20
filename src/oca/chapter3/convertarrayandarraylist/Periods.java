package oca.chapter3.convertarrayandarraylist;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Periods {
    public static void main(String[] args) {

        LocalDate start = LocalDate.of(2019, Month.FEBRUARY, 19);
        LocalDate end = LocalDate.of(2019, Month.JULY, 19);


        Period period = Period.ofMonths(1);
        period(start, end, period);
    }

    public static void period(LocalDate start, LocalDate end, Period period) {

        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("yenilenme vaxti -> " + upTo);
            upTo = upTo.plus(period);
        }
    }
}
