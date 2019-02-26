package oca.chapter4.staticimports;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Imports {

    public static void main(String[] args) {
        List<String> strings = asList("aaa");  // Static import zamani Objecte ve yaxud Class adina ehtiyyac olmur

//        List<String> strings1 = Arrays.asList("aa");  Compile error
                            // cunki Arrays ozu import olmayb yalnniz asList static import olunub
    }

}
