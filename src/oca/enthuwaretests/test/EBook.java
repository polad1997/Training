package oca.enthuwaretests.test;

import java.util.ArrayList;
import java.util.List;

public class EBook extends Book {

    @Override
    public void read() {
        super.read();
    }

    @Override
    public void download() {


    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.remove(1);
        list.add(1, "c");
        System.out.println(list);
    }
}
