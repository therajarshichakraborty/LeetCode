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
    public int heightCalc(TreeNode root){
      if(root == null){
        return 0;
      }

      int leftHeightCalc = heightCalc(root.left);
      int rightHeightCalc = heightCalc(root.right);

      if(leftHeightCalc == -1 || rightHeightCalc == -1){
        return -1;
      }

      // if(rightHeightCalc == -1){
      //   return -1;
      // }

      if(Math.abs(leftHeightCalc - rightHeightCalc) > 1){
        return -1;
      }
      return Math.max(leftHeightCalc , rightHeightCalc) +1;
    }
    public boolean isBalanced(TreeNode root) {
      return heightCalc(root) != -1;
    }  
}