package udemy.bootcamp.algosdatascructures.leetcode;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 6};
        System.out.println(searchInsert(nums, 8));
    }

    public static int searchInsert(int[] nums, int target) {
        int count = 0;

        if (nums[count] > target) return 0;

        while (nums[count] < target) {

            count++;

            if (count == nums.length) {
                return count;
            } else if (nums[count] > target) {
                break;
            }
        }
        return count;
    }

}
