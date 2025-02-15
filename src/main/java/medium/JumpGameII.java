package main.java.medium;

/**
 * {@link https://leetcode.com/problems/jump-game-ii/description}
 */
public class JumpGameII {

    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(jump(nums));
    }

    public static int jump(int[] nums) {
        int maxReach = 0;
        int numberOfJump = 0;
        int currentEnd = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            maxReach = Math.max(maxReach, i + nums[i]);

            if (i == currentEnd) {
                numberOfJump++;
                currentEnd = maxReach;

                if (currentEnd >= nums.length - 1) break;
            }
        }

        return numberOfJump;
    }

}
