package main.java.easy;

import com.sun.source.tree.Tree;

/**
 * {@link https://leetcode.com/problems/count-complete-tree-nodes/description}
 */
public class CountCompleteTreeNode {

    public static void main(String[] args) {
        TreeNode leftChild = new TreeNode(4);
        TreeNode rightChild = new TreeNode(5);
        TreeNode left = new TreeNode(2, leftChild, rightChild);

        TreeNode leftChild1 = new TreeNode(6);
        TreeNode right = new TreeNode(3, leftChild1, null);

        TreeNode root = new TreeNode(1, left, right);

        System.out.println(countNodes(root));
    }

    public static int countNodes(TreeNode root) {
        if (root == null) return 0;

        int count = 0;
        TreeNode currentNode = root;

        while (currentNode != null) {
            if (currentNode.left == null) {
                count++;
                currentNode = currentNode.right;
            } else {
                TreeNode predecessor = currentNode.left;
                int steps = 1;
                while (predecessor.right != null && predecessor.right != currentNode) {
                    predecessor = predecessor.right;
                    steps++;
                }

                if (predecessor.right == null) {
                    predecessor.right = currentNode;
                    count++;
                    currentNode = currentNode.left;
                } else {
                    predecessor.right = null;
                    currentNode = currentNode.right;
                }
            }
        }

        return count;
    }
}
