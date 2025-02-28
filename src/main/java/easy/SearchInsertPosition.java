package main.java.easy;

import static java.util.Arrays.binarySearch;

/**
 * {@link https://leetcode.com/problems/search-insert-position/description}
 */
public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;

        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        return binarySearchI(nums, 0, nums.length - 1, target);
    }

    public static int binarySearchI(int[] nums, int first, int last, int target) {

        if (first > last)
            return first;

        int middle = (first + last) / 2;

        if (nums[middle] < target)
            return binarySearchI(nums, middle + 1, nums.length - 1, target);
        else if (nums[middle] > target)
            return binarySearchI(nums, first, middle - 1, target);
        else
            return middle;
    }

}
