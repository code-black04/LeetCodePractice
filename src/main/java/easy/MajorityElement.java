package main.java.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link https://leetcode.com/problems/majority-element/description}
 */

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));

    }

    public static int majorityElement(int[] nums) {
        int majorityCount = nums.length / 2;
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (countMap.containsKey(nums[i])) {
                countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
            } else {
                countMap.put(nums[i], 1);
            }
        }

        final Integer[] checkNumberAndCount = {0, 0};

        countMap.forEach((number, count) -> {
            if (checkNumberAndCount[1] < count && count >= majorityCount) {
                checkNumberAndCount[0] = number;
                checkNumberAndCount[1] = count;
            }
        });

        return checkNumberAndCount[0];

    }
}
