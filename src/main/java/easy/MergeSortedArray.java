package main.java.easy;

/**
 * {@link https://leetcode.com/problems/merge-sorted-array/description/}
 */
public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {4, 0, 0, 0, 0, 0};  // nums1 has extra space
        int[] nums2 = {1, 2, 3, 5, 6};     // nums2 needs to be merged
        int m = 1;
        int n = 5;

        merge(nums1, m, nums2, n);

        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}
