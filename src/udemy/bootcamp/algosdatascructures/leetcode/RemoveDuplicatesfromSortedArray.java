package udemy.bootcamp.algosdatascructures.leetcode;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {-3, -1, -1, 0, 0, 0, 0, 0, 2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int count = 1;

        if (nums.length == 0) return 0;
        int last = nums[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[count - 1] == last) break;
            if (nums[i] == nums[i + 1]) {
                removeAndSwap(nums, i);
                i--;
            } else {
                count++;
            }
        }
        return count;
    }

    private static int removeAndSwap(int[] nums, int i) {

        for (int j = i; j < nums.length - 1; j++) {
            nums[j] = nums[j + 1];
        }
        return nums[nums.length - 1];
    }

}
