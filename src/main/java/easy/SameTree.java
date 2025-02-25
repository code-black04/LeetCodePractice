package main.java.easy;

/**
 * {@link https://leetcode.com/problems/same-tree/description}
 */
public class SameTree {

    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);

        TreeNode leftChild = new TreeNode(15);
        TreeNode rightChild = new TreeNode(7);
        TreeNode right = new TreeNode(3);

        TreeNode root = new TreeNode(2, left, right);
        TreeNode root1 = new TreeNode(1, left, right);



        System.out.println(isSameTree(root, root1));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;

        if (p!=null && q!=null && p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }

        return false;
    }
}
