
102. Binary Tree Level Order Traversal -- https://leetcode.com/problems/binary-tree-level-order-traversal/submissions/


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
 
 
 // The approach used here does not use a priority queue or a queue. 
 // Get the height of the tree, and for every level get the values for that level. 
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        int height = heightOfTree(root);
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i =1; i<= height; i++) {
            List<Integer> levelValues = new ArrayList<>() ;
            getNodesAtLevel(root,i, levelValues);
            result.add(levelValues);   
        }
        return result;
    }
    
    public void getNodesAtLevel(TreeNode root, int level,List<Integer> nodes) {
        
        if(root == null) {
            return;
        }
        else if(level == 1) {
           nodes.add(root.val);
        }
        else if(level>1) {
            getNodesAtLevel(root.left, level-1, nodes);
            getNodesAtLevel(root.right, level-1, nodes);
        }
        
        
    }
    
    public int heightOfTree(TreeNode root) {
        if(root == null) {
            return 0;
        }
         if(root.right ==null && root.left == null) {
            return 1;
        }
        else {
            return 1+ Math.max(heightOfTree(root.right), heightOfTree(root.left));
        }
    }
    
}
