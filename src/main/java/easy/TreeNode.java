package main.java.easy;

public class TreeNode {
    public boolean data;
    public int val;
      public TreeNode left;
      public TreeNode right;
      TreeNode() {}
      public TreeNode(int val) { this.val = val; }
      public TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
