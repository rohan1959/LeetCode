101. Symmetric Tree -- https://leetcode.com/problems/symmetric-tree/


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
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;        
        }  
        else {
            return isSymmetricRecursive(root.left, root.right);
        }
    }
    public boolean isSymmetricRecursive (TreeNode left, TreeNode right) {
       
        if(left == null && right == null) {
            return true;
        }
        else if(left == null || right == null) {
            return false;
        }
        
        else {
            return left.val == right.val && isSymmetricRecursive(left.left, right.right) && isSymmetricRecursive(left.right, right.left);
        }
    }
}
