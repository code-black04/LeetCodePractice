package main.java.easy;

/**
 * {@link https://leetcode.com/problems/single-number/description}
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int xorOfNums = 0;
        for (int num : nums) {
            xorOfNums ^= num;
        }
        return xorOfNums;
    }
}
