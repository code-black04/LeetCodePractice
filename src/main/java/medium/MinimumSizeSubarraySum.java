package main.java.medium;

/**
 * {@link https://leetcode.com/problems/minimum-size-subarray-sum/description}
 */
public class MinimumSizeSubarraySum {

    public static void main(String[] args) {
        int target = 7;
        int[] num = {2, 3, 1, 2, 4, 3};

        System.out.println(minSubArrayLen(target, num));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int j = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];

            while (sum >= target) {
                minLength = Math.min(minLength, i - j + 1);
                sum-=nums[j];
                j++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
