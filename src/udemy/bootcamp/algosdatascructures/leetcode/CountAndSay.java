package udemy.bootcamp.algosdatascructures.leetcode;

public class CountAndSay {

    public static void countAndSay(int n) {
        int k = n;
        int uzunluq = 1;
        while (k > 9) {
            k = k / 10;
            uzunluq++;

        }
        int eynilerinsayi = 0;
        int[] array = new int[uzunluq];
        for (int i = 0; i < uzunluq; i++) {
            int m = n % 10;
            if (n > 0) n = n / 10;
            array[i] = m;

            if (array[i] == array[++i]) {
                eynilerinsayi ++ ;
            }
            System.out.println(eynilerinsayi);

        }

    }

    public static void main(String[] args) {
        countAndSay(112211);
    }

}
