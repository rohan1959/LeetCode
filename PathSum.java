LC -- https://leetcode.com/problems/path-sum/submissions/

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
 
 
 // The solution below is recursive and finds all paths to check if there exists a sum with target. 
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        
        if(root == null) {
            return false;
        }
        if(root.val == sum && root.right == null && root.left == null) {
            return true;
        }
        return hasPathSum(root.right, sum - root.val) || hasPathSum(root.left, sum-root.val);
    }
}
