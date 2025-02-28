package main.java.medium;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * {@link https://leetcode.com/problems/longest-consecutive-sequence/description}
 */
public class LongestConsecutiveNumber {

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {

        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        HashMap<String, Integer> hashMap = new HashMap<>();

        int i = 0;
        while (i < nums.length) {
            StringBuilder str = new StringBuilder();
            int count = 1;

            while (i < nums.length - 1 && (nums[i+1] - nums[i] == 1 || nums[i+1] == nums[i])) {
                if (nums[i + 1] != nums[i]) {
                    str.append(nums[i]);
                    count++;
                }
                i++;
            }
            str.append(nums[i]);
            hashMap.put(str.toString(), count);
            i++;
        }

        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
            }
        }

        return maxValue;
    }
}
