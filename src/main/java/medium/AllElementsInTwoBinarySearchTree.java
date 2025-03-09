package main.java.medium;

import com.sun.source.tree.Tree;
import main.java.easy.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllElementsInTwoBinarySearchTree {
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode left1 = new TreeNode(1);
        TreeNode right1 = new TreeNode(4);
        TreeNode treeNode1 = new TreeNode(2, left1, right1);

        TreeNode left2 = new TreeNode(0);
        TreeNode right2 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(1, left2, right2);

        System.out.println(getAllElements(treeNode1, treeNode2));
    }

    public static List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return null;
        if (root1 == null && root2 != null) return getInOrder(root2).stream().sorted().toList();
        if (root1 != null && root2 == null) return getInOrder(root1).stream().sorted().toList();

        getInOrder(root1);
        getInOrder(root2);
        return list.stream().sorted().toList();
    }

    public static List<Integer> getInOrder(TreeNode node)
    {
        if (node == null)
            return null;
        getInOrder(node.left);

        list.add(node.val);

        getInOrder(node.right);

        return list;
    }
}
