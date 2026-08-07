/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  public void preOrder(TreeNode root, List<Integer> value) {
    if (root == null) {
      return;
    }
    value.add(root.val);
    preOrder(root.left, value);
    preOrder(root.right, value);
  }

  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> value = new ArrayList<>();

    preOrder(root, value);

    return value;
  }
}