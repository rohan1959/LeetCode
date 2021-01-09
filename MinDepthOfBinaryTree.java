111. Minimum Depth of Binary Tree -- https://leetcode.com/problems/minimum-depth-of-binary-tree/

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
    public int minDepth(TreeNode root) {
      if(root == null) { // base condition to check for min depth. 
          return 0;
      }
        else {
           return minDepthValue(root);
        }
    }
    
    public int minDepthValue(TreeNode root) {
        if(root == null) {
            return Integer.MAX_VALUE;
        }
        if(root.right == null && root.left ==null) { // leaf node is the last node with out left and right children
            return 1;
        } 
        return 1+ Math.min(minDepthValue(root.left), minDepthValue(root.right)); // recursively compare values of min depth of each left and right values. 
    
    }
}
