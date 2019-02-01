package sortingalgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion {

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

        System.out.print(Arrays.toString(insertionSorting(array)));
    }

    public static int[] insertionSorting(int[] array) {
        int temp;
        for (int i = 0; i <= array.length - 2; i++) {
            for (int j = i + 1; j <= array.length - 1; j++) {
                if (array[j] < array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}