package main.java.easy;

import java.util.Stack;

/**
 * {@link https://leetcode.com/problems/minimum-absolute-difference-in-bst/description}
 */
public class MinimumAbsoluteDifferenceInBST {

    public static void main(String[] args) {

        TreeNode leftChild = new TreeNode(1);
        TreeNode rightChild = new TreeNode(3);
        TreeNode left = new TreeNode(2, leftChild, rightChild);

        TreeNode right = new TreeNode(6);
        TreeNode node = new TreeNode(4, left, right);

        System.out.println(getMinimumDifference(node));

    }

    public static int getMinimumDifference(TreeNode root) {
        int previousMinimum = Integer.MAX_VALUE;
        int currentMinimum = Integer.MAX_VALUE;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;

        while (currentNode != null || !stack.isEmpty()) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }

            currentNode = stack.pop();
            currentMinimum = Math.min(currentMinimum, Math.abs(currentNode.val - previousMinimum));
            previousMinimum = currentNode.val;
            currentNode = currentNode.right;
        }
        return currentMinimum;
    }
}
