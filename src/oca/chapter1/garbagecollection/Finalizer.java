package oca.chapter1.garbagecollection;

import java.util.ArrayList;
import java.util.List;

public class Finalizer {

    private static List objects = new ArrayList();
    public static void main(String[] args) {

    }

    protected void finalize(){
        objects.add(this);
    }
}
