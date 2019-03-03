package algos.array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.print("Write the length of array: ");
        Scanner scanner = new Scanner(System.in);
        int lengthArray = scanner.nextInt();
        int[] array = new int[lengthArray];

        Random random = new Random();
        int randomInt;

        for (int i = 0; i < array.length; i++) {
            randomInt = -100 + random.nextInt(200);

            System.out.println("Random number generated is : " + randomInt);

            array[i] = randomInt;
        }

        System.out.println(Arrays.toString(array));

        int negatives = 0, positives = 0, zeros = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negatives++;
            } else if (array[i] == 0) {
                zeros++;
            } else {
                positives++;
            }
        }

        DecimalFormat df2 = new DecimalFormat("##.##");
        double percentOfPositives = (positives*100.00) / array.length;
        System.out.println("Percent of Positives : " + df2.format(percentOfPositives));

        double percentOfNegatives = (negatives*100.00) /array.length;
        System.out.println("Percent of Negatives : " + df2.format(percentOfNegatives));

        double percentOfZeros = (zeros*100.00) /array.length;
        System.out.println("Percent of Negatives : " + df2.format(percentOfZeros));
    }

}
