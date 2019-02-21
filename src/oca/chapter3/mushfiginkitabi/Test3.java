package oca.chapter3.mushfiginkitabi;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] a) {
        Integer[] arr = {1, 2, 3, 4};
        arr[1] = null;
//        for (Integer a : arr) System.out.println(a);   Compile error verir cunki  a uje scope daxilinde define olub

        int[][] array = new int[4][];
        array[0] = new int[5];
        array[1] = new int[2];
        array[3] = new int[0];
        System.out.println(Arrays.toString(array[3]));
//        array[2] = new Integer[2]; array[] objectine Integer menimsede bilmerem

    }
}
