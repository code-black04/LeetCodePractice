package main.java.medium;

import java.util.Collections;
import java.util.LinkedList;

/**
 * {@link https://leetcode.com/problems/rotate-array/description}
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {
        int numsLength = nums.length;
        k %= numsLength;

        if (numsLength <= 1 || k == 0) {
            return;
        }

        reverse(nums, 0, numsLength - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, numsLength - 1);

    }

    public static void reverse(int arr[], int first, int last) {
        while (first <= last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }
}
