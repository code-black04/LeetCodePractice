package main.java.easy;

/**
 * {@link https://leetcode.com/problems/maximum-ascending-subarray-sum/description/}
 */

public class MaximumAscendingSubArray {

    public static void main(String[] args) {
        int nums[] = {100,10, 120};
        System.out.println(maxAscendingSum(nums));
    }

    public static int maxAscendingSum(int[] nums) {
        int numsLength = nums.length;

        if (numsLength == 1) {
            return nums[0];
        }

        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < numsLength; i++) {
            if (nums[i] > nums[i-1]){
                currentSum = currentSum + nums[i];
            } else{
                maxSum = Math.max(maxSum, currentSum);
                currentSum = 0;
                currentSum = currentSum + nums[i];
            }
        }

        maxSum = Math.max(maxSum, currentSum);
        return maxSum;
    }

}
