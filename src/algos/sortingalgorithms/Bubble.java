package sortingalgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array : ");
        int countElements = sc.nextInt();

        int[] array = new int[countElements];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array is : " + Arrays.toString(array));

        System.out.print("After sorting : ");

        System.out.print(Arrays.toString(bubbleSorting(array)));
    }

    public static int[] bubbleSorting(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}
