package main.java.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link https://leetcode.com/problems/summary-ranges/description}
 */

public class SummaryRange {

    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        System.out.println(summaryRanges(nums));
    }

    public static List<String> summaryRanges(int[] nums) {

        List<String> list = new ArrayList<String>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            while (i < nums.length - 1 && nums[i+1] - nums[i] == 1){
                i++;
            }

            if (num != nums[i]){
                list.add(num + "->" + nums[i]);
            } else {
                list.add(nums[i] + "");
            }
        }

        return list;
    }
}
