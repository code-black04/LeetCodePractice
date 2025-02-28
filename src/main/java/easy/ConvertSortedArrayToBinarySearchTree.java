package main.java.easy;

/**
 * {@link https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description}
 */
public class ConvertSortedArrayToBinarySearchTree {

    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        System.out.println(sortedArrayToBST(nums));
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return createTree(nums, 0, nums.length - 1);
    }

    public static TreeNode createTree(int[] nums, int first, int last) {
        if (first > last) return null;

        TreeNode root = new TreeNode();
        int middle = (first + last) / 2;

        root.val = nums[middle];
        root.left = createTree(nums, first, middle - 1);
        root.right = createTree(nums, middle + 1, last);

        return root;
    }
}
