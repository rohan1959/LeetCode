559. Maximum Depth of N-ary Tree -- https://leetcode.com/problems/maximum-depth-of-n-ary-tree/


/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
// N -ary Tree has a List of nodes at everylevel. 
class Solution {
    public int maxDepth(Node root) {
        if(root == null) {
            return 0;
        }
        else {
            return maxDepthOfNTree(root);
        }
    }
    
    public int maxDepthOfNTree( Node root) {
        int depth =0;
        if(root == null) {
            return Integer.MIN_VALUE;
        }
        for(Node node: root.children) { // iterate the entire list to find the max value. 
           depth = Math.max(depth, maxDepthOfNTree(node));
        }
        return depth +1;
    }
}
