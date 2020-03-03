package leetcode.goupalgo;

/**
 * @author PoladA
 * @Date&Time 2/24/2020 15:41
 */
public class FindNumberswithEvenNumberofDigits {

    public static void main(String[] args) {
        FindNumberswithEvenNumberofDigits o = new FindNumberswithEvenNumberofDigits();
        int[] numbers = {437, 315, 322, 431, 686, 264, 442};
        o.findNumbers(numbers);
    }

    public int findNumbers(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            int countDigits = 0;
            while (nums[i] >= 1) {
                nums[i] = nums[i] / 10;
                countDigits++;
            }

            if (countDigits % 2 == 0) count++;
        }

        return count;
    }
}
