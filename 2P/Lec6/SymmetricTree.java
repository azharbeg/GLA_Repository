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
class SymmetricTree {

    boolean check(TreeNode l, TreeNode r){    
       // if both are null
        if(l == null && r == null)
            return true;       
        // If one of them is not null & other is null -> false
        if(l == null || r == null){
            return false;
        }
        if((l.val == r.val) && check(l.left, r.right)  && check(l.right , r.left))
           return true;

        return false;
    }

    public boolean isSymmetric(TreeNode root) {
        
        return check(root.left, root.right);
    }
}