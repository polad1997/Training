package udemy.bootcamp.algosdatascructures.bublesort;

public class BubleSort {
    public static void main(String[] args) {
        BubleSort bubleSort = new BubleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        bubleSort.bubbleSort(arr);
        for (int a : arr) {
            System.out.println(a);
        }
    }

    public void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }
}
