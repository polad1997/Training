package oca.chapter4.passbyvalue;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void change(int[] arr){
        System.out.println(Arrays.toString(arr) + "  same ");
        arr[0] = 3;
        arr[1]++;
        arr = new int[2];
        System.out.println(Arrays.toString(arr) + "    changed");
    }
}
