package main.java.medium;

import java.util.Arrays;

/**
 * {@link https://leetcode.com/problems/product-of-array-except-self/description}
 */
public class ProductOfArrayExceptItself {

    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        productExceptSelf(nums);
    }

    public static int[] productExceptSelf(int[] nums) {

        int numsLength = nums.length;

        int[] answer = new int[numsLength];

        if (numsLength == 1) {
            answer = nums;
        } else {
            int[] prefixArray = new int[numsLength];
            prefixArray[0] = 1;

            for (int i = 1; i < numsLength; i++) {
                prefixArray[i] = prefixArray[i -1] * nums[i-1];
            }

            int suffix = 1;

            for (int i = numsLength - 1; i >= 0 ; i--) {
                answer[i] = prefixArray[i] * suffix;
                suffix = suffix * nums[i];
            }
        }

        return answer;
    }

}
