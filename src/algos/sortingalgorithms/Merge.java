package algos.sortingalgorithms;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        int[] arr = {17, 87, 6, 22, 41, 3, 13, 54};
        Merge merge = new Merge();
        merge.mergeSort(arr);

    }

    public void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    public void mergeSort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        } else {
            int midIndex = (lowIndex + highIndex) / 2;
            mergeSort(array, lowIndex, midIndex);
            System.out.println(Arrays.toString(array));
            mergeSort(array, midIndex + 1, highIndex);
            System.out.println(Arrays.toString(array));
        }

        /**
         * NOT FINISHED !!!
         */
    }

}