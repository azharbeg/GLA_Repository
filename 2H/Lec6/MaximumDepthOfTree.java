
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
class MaximumDepthOfTree {
    public int maxDepth(TreeNode root) {
        
         if(root == null) // if root is null, that means no node from now
        {
             return 0; // so we will return 0
        }
        
        int left_side = maxDepth(root.left); // we will call for left side
        int right_side = maxDepth(root. right); // we will call for right side
        
        // so, if any of the node exist from any side, we will take this and increase our height
        
        return Math.max(left_side,right_side ) + 1;
    }
}
