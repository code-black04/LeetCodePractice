package main.java.easy;

/**
 * {@link https://leetcode.com/problems/remove-element/description/}
 */

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {3, 3};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length-1;

        while (i <= j) {
            if (nums[i] == val) {
                while (nums[j] == val && j > i) {
                    nums[j] = '_';
                    j--;
                }
                if (i <= j) {
                    nums[i] = nums[j];
                    nums[j] = '_';
                    j--;
                }
            }
            i++;
        }

        for (int integer : nums) {
            System.out.println(integer);
        }

        int k = 0;
        for (int num : nums) {
            if (num != '_') k++;
        }

        return k;
    }
}
