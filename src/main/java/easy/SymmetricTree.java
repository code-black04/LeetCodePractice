package main.java.easy;

/**
 * {@link https://leetcode.com/problems/symmetric-tree/description}
 */

public class SymmetricTree {

    public static void main(String[] args) {
        TreeNode leftChild = new TreeNode(3);
        TreeNode rightChild = new TreeNode(4);
        TreeNode left = new TreeNode(2, leftChild, rightChild);

        TreeNode leftChild1 = new TreeNode(4);
        TreeNode rightChild1 = new TreeNode(3);
        TreeNode right = new TreeNode(2, leftChild1, rightChild1);

        TreeNode root = new TreeNode(1, left, right);

        System.out.println(isSymmetric(root));
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        return segregateLeftRightTree(root.left, root.right);
    }

    public static boolean segregateLeftRightTree(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;

        if (left.val == right.val) {
            return segregateLeftRightTree(left.left, right.right) && segregateLeftRightTree(left.right, right.left);
        }

        return false;
    }

}
