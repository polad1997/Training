package oca.chapter4.passbyvalue;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) {
        String name = "Polad";
        method(name);

        LocalDate localDate = LocalDate.now();
        method2(localDate);
        System.out.println(localDate);   //Path by value oturuldu deye now() cap edildi

        ArrayList<Integer> integers = new ArrayList<>();
        method3(integers);
        System.out.println(integers);   //Eger ki reassign etmemisemse , eyni objecti update ediremse its okaydd

    }

    public static void method(String name) {
        name = "ASDASD";
    }

    public static void method2(LocalDate date) {
        date = LocalDate.of(1997, Month.JANUARY, 18);
    }

    public static void method3(ArrayList arrayList) {
        arrayList.add(44);
        arrayList = new ArrayList();
    }

}
