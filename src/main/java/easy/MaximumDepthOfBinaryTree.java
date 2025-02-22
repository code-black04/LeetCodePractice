package main.java.easy;

/**
 * {@link https://leetcode.com/problems/maximum-depth-of-binary-tree/description}
 */
public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {
        TreeNode left = new TreeNode(9);

        TreeNode leftChild = new TreeNode(15);
        TreeNode rightChild = new TreeNode(7);
        TreeNode right = new TreeNode(20, leftChild, rightChild);

        TreeNode root = new TreeNode(3, left, right);

        System.out.println(maxDepth(root));

    }

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

