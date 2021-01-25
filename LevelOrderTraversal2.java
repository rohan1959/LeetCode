107. Binary Tree Level Order Traversal II -- https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        int heightOfTree = heightTree(root);
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i =heightOfTree; i>= 1;i--) {
            List<Integer> valuesAtNodeLevel = new ArrayList<Integer>();
            getValueOfNodes(root, i, valuesAtNodeLevel);
            result.add(valuesAtNodeLevel);
        }
        
        return result;
        
    }
    
    public void getValueOfNodes(TreeNode root, int level ,List<Integer>nodesAtLevel) {
        if(root == null)
            return;
            else if(level ==1) {
                nodesAtLevel.add(root.val);
            }
        else if( level>1){
            getValueOfNodes(root.left, level-1, nodesAtLevel);
            getValueOfNodes(root.right, level-1, nodesAtLevel);
        }
                
        
        
    }
    
    public int heightTree(TreeNode root) {
        if(root == null) {
            return 0;
        }
        else if(root.left == null && root.right == null) {
            return 1;
        }
        else {
            return 1+ Math.max(heightTree(root.left),heightTree(root.right));
        }
    }
}
