package main.java.easy;

/**
 * {@link https://leetcode.com/problems/invert-binary-tree/description}
 */
public class InvertBinaryTree {

    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);

        TreeNode leftChild = new TreeNode(15);
        TreeNode rightChild = new TreeNode(7);
        TreeNode right = new TreeNode(3);

        TreeNode root = new TreeNode(2, left, right);

        System.out.println(invertTree(root));
    }

    public static TreeNode invertTree(TreeNode root) {

        if (root == null) return null;

        invertTree(root.left);
        invertTree(root.right);

        TreeNode node = new TreeNode();
        node = root.left;
        root.left = root.right;
        root.right = node;

        return root;

    }

}
