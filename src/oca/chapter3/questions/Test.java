package oca.chapter3.questions;

import java.util.ArrayList;

/**
 * Array bir object dir ve equalsi override etmir
 * buna gore de content eyni olsa bele same objectler sayilmir
 */
public class Test {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 1, 1};

        int[] ints1 = new int[]{1, 1, 1};
        System.out.println(ints == ints1);

    }
}
