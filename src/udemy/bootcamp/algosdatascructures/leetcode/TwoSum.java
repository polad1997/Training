package udemy.bootcamp.algosdatascructures.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 5, 5, 15};
        twoSum(nums, 10);
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] indexes = {i, j};
                    return indexes;
                }
            }
        }

        return null;
    }
}
