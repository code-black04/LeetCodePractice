package main.java.medium;

/**
 * {@link https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description}
 */

public class RemovesDuplicateFromSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1;
        int timer = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                timer++;
            } else {
                timer = 1;
            }

            if (timer <= 2){
                nums[k] = nums[i];
                k++;
            }
        }

        for (int num : nums) {
            System.out.println(num);
        }

        return k;
    }
}
